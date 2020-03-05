package renthouse.renthouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import renthouse.renthouse.entity.Users;
import renthouse.renthouse.service.UsersService;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class UsersController {
    @Autowired(required = false)
    private UsersService us;

    @RequestMapping("/addUser")
    public  String  addUser(Users users){
        int temp=us.add(users);
        return "{\"result\":"+temp+"}";
    }

    @RequestMapping("/login")
    public String login(Users users, HttpSession session){
        Users users1=us.single(users);
        int temp=0;
        if (users!=null){
            temp=1;
            session.setAttribute("info",users1);
            session.setMaxInactiveInterval(600);
        }
        return "{\"result\":"+temp+"}";
    }

}
