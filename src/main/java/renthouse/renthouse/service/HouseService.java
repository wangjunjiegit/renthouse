package renthouse.renthouse.service;

import com.github.pagehelper.PageInfo;
import renthouse.renthouse.entity.House;
import renthouse.renthouse.tools.Condition;

public interface HouseService {
    public PageInfo<House> queryHouse(Condition condition);
    public int add(House house);
    public PageInfo<House> queryHouseById(Condition condition);
    public int delete(String id);
    public int update(House house);
    public House single(String id);
}
