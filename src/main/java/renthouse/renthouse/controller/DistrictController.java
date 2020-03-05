package renthouse.renthouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import renthouse.renthouse.entity.District;
import renthouse.renthouse.service.DistrictService;

import java.util.List;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class DistrictController {
    @Autowired(required = false)
    private DistrictService ds;


    @RequestMapping("/queryDistrict")
    public List<District> queryDistrict(){
        return ds.query();
    }
}
