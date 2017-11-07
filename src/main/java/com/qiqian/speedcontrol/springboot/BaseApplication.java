package com.qiqian.speedcontrol.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <pre>Spring Boot服务启动入口，使用了@SpringBootApplication注解，
 *  会自动扫描该类子路径下所有
 *   @Controller、@Service、@Repository、@Conponent 等注解类</pre>
 */
@SpringBootApplication
@ComponentScan
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }

}
