package com.younghyeon.diary.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.younghyeon.diary.model.dao")
public class DBConfig {

}
