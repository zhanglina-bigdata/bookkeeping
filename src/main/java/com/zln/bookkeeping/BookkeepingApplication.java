package com.zln.bookkeeping;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.zln.bookkeeping.mapper")
public class BookkeepingApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookkeepingApplication.class, args);
    }
}
