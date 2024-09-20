package com.example.demomvc.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        // Sử dụng driver H2 (bạn cần thêm dependency H2 vào pom.xml)
        dataSource.setUrl("jdbc:h2:mem:testdb"); // Tạo một cơ sở dữ liệu trong bộ nhớ
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
}
