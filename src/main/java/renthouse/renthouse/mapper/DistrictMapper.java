package renthouse.renthouse.mapper;

import java.util.List;
import renthouse.renthouse.entity.District;
import renthouse.renthouse.entity.DistrictExample;

public interface DistrictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(District record);

    int insertSelective(District record);

    List<District> selectByExample(DistrictExample example);

    District selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}