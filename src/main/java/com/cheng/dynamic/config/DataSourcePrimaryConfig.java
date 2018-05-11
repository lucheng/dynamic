package com.cheng.dynamic.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSourceFactory;

@Configuration
public class DataSourcePrimaryConfig {
    @Bean(name = "primaryDS")@Qualifier("primaryDS")
    @ConfigurationProperties(prefix="cheng.primary.datasource")
    @Primary
    public DataSource primaryDataSource(Properties datasource) throws Exception{
        return DruidDataSourceFactory.createDataSource(datasource);
    }
}