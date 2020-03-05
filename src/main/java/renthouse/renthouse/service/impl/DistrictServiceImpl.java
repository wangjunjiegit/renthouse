package renthouse.renthouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renthouse.renthouse.entity.District;
import renthouse.renthouse.mapper.DistrictMapper;
import renthouse.renthouse.service.DistrictService;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired(required = false)
    private DistrictMapper dm;

    @Override
    public List<District> query() {
        return dm.selectByExample(null);
    }
}
