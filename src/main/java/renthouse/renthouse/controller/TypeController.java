package renthouse.renthouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import renthouse.renthouse.entity.Type;
import renthouse.renthouse.service.TypeService;

import java.util.List;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class TypeController {
    @Autowired(required = false)
    private TypeService ts;

    @RequestMapping("/queryType")
    public List<Type> queryType(){
        return ts.query();
    }

}
