package com.moonrabit.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.moonrabit.demo.mapper")
public class TryMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryMybatisApplication.class, args);
	}

}
