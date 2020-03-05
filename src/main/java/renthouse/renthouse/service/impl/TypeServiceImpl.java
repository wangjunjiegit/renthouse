package renthouse.renthouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renthouse.renthouse.mapper.TypeMapper;
import renthouse.renthouse.service.TypeService;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired(required = false)
    private TypeMapper tm;

    @Override
    public List query() {
        return tm.selectByExample(null);
    }
}
