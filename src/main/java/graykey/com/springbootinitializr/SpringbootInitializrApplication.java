package graykey.com.springbootinitializr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication      //  @SpringBootApplication ：标注该应用是一个 Spring Boot 应用，main方法使该应用成为一个主程序，将在应用启动时首先被执行。
@RestController         //  @RestController ：标注这个程序是一个控制器。
public class SpringbootInitializrApplication {

    @RequestMapping("/")
    String home(){
        return "hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootInitializrApplication.class, args);
    }
}

