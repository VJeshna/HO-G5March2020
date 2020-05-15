package com.mastek.app.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@EnableWebMvc
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement(proxyTargetClass=true)
@ComponentScan(basePackages = { "com.mastek.app", "com.mastek.app.advice", "com.mastek.app.service" })
@PropertySource("classpath:database.properties")
public class AppConfig {

	private final static String DRIVER = "driver";
	private final static String URL = "url";
	private final static String USER = "dbuser";
	private final static String PASSWORD = "dbpassword";
	
	@Autowired
	Environment environment;
	
	
	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	
	@Bean
	public DataSource getDataSource() {
		// 1. create an object of DataSourceManger
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(environment.getProperty(DRIVER));
		dmds.setUrl(environment.getProperty(URL));
		dmds.setUsername(environment.getProperty(USER));
		dmds.setPassword(environment.getProperty(PASSWORD));

		return dmds;
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean(name= {"transactionManagerName"})
    public PlatformTransactionManager dbTransactionManager() {
		DataSourceTransactionManager transactionManager
                = new DataSourceTransactionManager();
        transactionManager.setDataSource(getDataSource());
        return transactionManager;
    }
}
