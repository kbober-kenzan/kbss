package com.kbss.application.config;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class DatabaseConfig {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		BoneCPDataSource dataSource = new BoneCPDataSource();

		dataSource.setDriverClass(environment.getRequiredProperty("db.driver"));
		dataSource.setJdbcUrl(environment.getRequiredProperty("db.url"));
		dataSource.setUsername(environment.getRequiredProperty("db.username"));
		dataSource.setPassword(environment.getRequiredProperty("db.password"));

		return dataSource;
		
//		DataSourceBuilder factory = DataSourceBuilder
//	            .create(this.properties.getClassLoader())
//	            .driverClassName(this.properties.getDriverClassName())
//	            .url(this.properties.getUrl())
//	            .username(this.properties.getUsername())
//	            .password(this.properties.getPassword());
//	    return factory.build();
	}

	// Other beans are omitted.

}
