package com.example.bootjsp;




import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.mycs,com.example.bootjsp"})
@MapperScan(basePackages ={"com.mycs.dao"})
public class BootjspApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootjspApplication.class, args);
    }

}
