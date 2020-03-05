package renthouse.renthouse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import renthouse.renthouse.mapper.StreetMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RenthouseApplicationTests {
   @Autowired(required = false)
    private StreetMapper sm;
    @Test
    public void contextLoads() {

    }

}
