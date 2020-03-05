package renthouse.renthouse.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renthouse.renthouse.entity.House;
import renthouse.renthouse.mapper.HouseMapper;
import renthouse.renthouse.service.HouseService;
import renthouse.renthouse.tools.Condition;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired(required = false)
    private HouseMapper hm;

    public PageInfo<House> queryHouse(Condition condition){
        PageHelper.startPage(condition.getPage(),condition.getPagesize());
        List<House>list=hm.queryHouse(condition);
        return new PageInfo<>(list);
    }

    public int add(House house){
        return hm.insertSelective(house);
    }


    public PageInfo<House> queryHouseById(Condition condition) {
        PageHelper.startPage(condition.getPage(),condition.getPagesize());
        List<House>list=hm.queryHouseById(condition.getUserId());
        return new PageInfo<>(list);
    }

    public int delete(String id){return  hm.deleteByPrimaryKey(id);}


    public int update(House house) {
        return hm.updateByPrimaryKeySelective(house);
    }

    @Override
    public House single(String id) {
        return hm.selectByPrimaryKey(id);
    }
}
