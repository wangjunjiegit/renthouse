package renthouse.renthouse.mapper;

import java.util.List;
import renthouse.renthouse.entity.Type;
import renthouse.renthouse.entity.TypeExample;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}