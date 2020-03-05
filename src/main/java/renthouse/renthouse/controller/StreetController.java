package renthouse.renthouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import renthouse.renthouse.entity.Street;
import renthouse.renthouse.service.StreetService;

import java.util.List;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class StreetController {
    @Autowired(required = false)
    private StreetService ss;

    @RequestMapping("/queryStreet")
    public List<Street> queryStreet(Integer id){
        return ss.queryStreet(id);
    }

    @RequestMapping("/queryAll")
    public List<Street> queryAll(){
        return ss.query();
    }

}
