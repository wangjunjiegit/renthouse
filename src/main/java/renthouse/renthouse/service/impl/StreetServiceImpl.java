package renthouse.renthouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renthouse.renthouse.entity.Street;
import renthouse.renthouse.mapper.StreetMapper;
import renthouse.renthouse.service.StreetService;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {
    @Autowired(required = false)
    private StreetMapper sm;

    //查对应区相应的街道
    public List<Street> queryStreet(Integer id) {
        return sm.queryStreet(id);
    }
    public List<Street> query(){
        return sm.selectByExample(null);
    }
}
