package com.space;

import com.space.config.AppConfig;
import com.space.config.MongoConfig;
import com.space.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = { AppConfig.class, MongoConfig.class, SecurityConfig.class})
public class SpaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaceApplication.class, args);
	}
}
