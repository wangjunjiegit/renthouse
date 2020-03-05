package renthouse.renthouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("renthouse.renthouse.mapper")
public class RenthouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenthouseApplication.class, args);
    }

}
