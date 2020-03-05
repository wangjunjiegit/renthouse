package renthouse.renthouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renthouse.renthouse.entity.Users;
import renthouse.renthouse.entity.UsersExample;
import renthouse.renthouse.mapper.UsersMapper;
import renthouse.renthouse.service.UsersService;
import renthouse.renthouse.tools.MD5Utils;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired(required = false)
    private UsersMapper um;

    public int add(Users users){
        //进行密码加密 解决敏感信息问题
        users.setPassword(MD5Utils.md5Encrypt(users.getPassword()));
        return um.insertSelective(users);
    }

    public Users single(Users users){
        users.setPassword(MD5Utils.md5Encrypt(users.getPassword()));
        UsersExample ue=new UsersExample();
        UsersExample.Criteria usrec=ue.createCriteria();
        usrec.andNameEqualTo(users.getName());
        usrec.andPasswordEqualTo(users.getPassword());
        List<Users>list= um.selectByExample(ue);
        if (list!=null){
            return list.get(0);
        }else {
            return null;
        }
    }
}
