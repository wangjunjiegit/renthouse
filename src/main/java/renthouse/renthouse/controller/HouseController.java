package renthouse.renthouse.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import renthouse.renthouse.entity.House;
import renthouse.renthouse.entity.Users;
import renthouse.renthouse.service.HouseService;
import renthouse.renthouse.tools.Condition;
import renthouse.renthouse.tools.SpringBootFileUploadUtil;


import javax.servlet.http.HttpSession;
import java.io.File;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class HouseController {
    @Autowired(required = false)
    private HouseService hs;

    //文件上传的地址
    @Value("${file.path}")
    private String filePath;

    @RequestMapping("/queryHouse")
    public PageInfo<House> queryHouse(Condition condition){
        if (condition.getPage()==null){
            condition.setPage(1);
        }
        return hs.queryHouse(condition);
    }

    @RequestMapping("/addHouse")
    public String addHouse(House house, HttpSession session,
                           @RequestParam(value = "file",required = false)MultipartFile file){
        try {
            if (file!=null){
              String filename=SpringBootFileUploadUtil.upload(file,filePath);
              house.setPath(filename);
            }
            //生成id
            String id=System.currentTimeMillis()+"";
            house.setId(id);
            //添加用户id
            Users users=(Users) session.getAttribute("info");
            house.setUserId(users.getId());
            int temp=hs.add(house);
            return "{\"result\":"+temp+"}";
        }catch (Exception e){
            e.printStackTrace();
            return "{\"result\":0}";
        }
    }

    @RequestMapping("/userHouse")
    public PageInfo<House> userHouse(Condition condition,HttpSession session){
        if (condition.getPage()==null){
            condition.setPage(1);
        }
        Users users=(Users)session.getAttribute("info");
        condition.setUserId(users.getId());
        PageInfo<House> list=hs.queryHouseById(condition);
        return list;
    }

    @RequestMapping("/deleteHouse")
    public String deleteHouse(String id,String path){
        int temp=hs.delete(id);
        if (temp>0){
            File file=new File(filePath+"/"+path);
            if (file.exists()){
                file.delete();
            }
        }
        return "{\"result\":"+temp+"}";
    }

    @RequestMapping("/singleHouse")
    public House singleHouse(String id){
        return hs.single(id);
    }

    @RequestMapping("/updateHouse")
    public String updateHouse(House house){
        int temp=hs.update(house);
        return "{\"result\":"+temp+"}";
    }
}
