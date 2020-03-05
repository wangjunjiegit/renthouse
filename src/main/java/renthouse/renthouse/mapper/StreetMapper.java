package renthouse.renthouse.mapper;

import java.util.List;
import renthouse.renthouse.entity.Street;
import renthouse.renthouse.entity.StreetExample;

public interface StreetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Street record);

    int insertSelective(Street record);

    List<Street> selectByExample(StreetExample example);

    Street selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Street record);

    int updateByPrimaryKey(Street record);

    List<Street> queryStreet(Integer id);
}