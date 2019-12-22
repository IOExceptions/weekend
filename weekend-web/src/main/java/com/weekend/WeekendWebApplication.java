package com.weekend;


import com.weekend.common.code.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.weekend.common.module.mapper")
public class WeekendWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeekendWebApplication.class, args);
    }

    @RequestMapping("hello")
    public Object hello() {
        return IdWorker.getId();
    }

}
