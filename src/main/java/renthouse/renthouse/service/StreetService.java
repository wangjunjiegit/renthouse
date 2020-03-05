package renthouse.renthouse.service;

import renthouse.renthouse.entity.Street;

import java.util.List;

public interface StreetService {
    public List<Street> queryStreet(Integer id);
    public List<Street> query();
}
