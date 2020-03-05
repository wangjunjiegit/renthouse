package renthouse.renthouse.mapper;

import java.util.List;
import renthouse.renthouse.entity.Users;
import renthouse.renthouse.entity.UsersExample;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}