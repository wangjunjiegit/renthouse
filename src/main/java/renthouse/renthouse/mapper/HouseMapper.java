package renthouse.renthouse.mapper;

import java.util.List;
import renthouse.renthouse.entity.House;
import renthouse.renthouse.entity.HouseExample;
import renthouse.renthouse.tools.Condition;

public interface HouseMapper {
    int deleteByPrimaryKey(String id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    List<House> queryHouse(Condition condition);
    List<House> queryHouseById(Integer uid);
}