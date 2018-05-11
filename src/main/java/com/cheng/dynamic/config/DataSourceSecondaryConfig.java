package com.cheng.dynamic.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSourceFactory;

@Configuration
public class DataSourceSecondaryConfig {
	@Bean(name = "secondaryDS")
    @ConfigurationProperties(prefix="cheng.secondary.datasource")
    public DataSource secondaryDataSource(Properties datasource) throws Exception{
        return DruidDataSourceFactory.createDataSource(datasource);
    }
}