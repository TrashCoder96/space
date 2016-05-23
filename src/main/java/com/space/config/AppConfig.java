package com.space.config;

import com.space.controller.HelloController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ivan Timofeev on 23.05.2016.
 */

@Configuration
public class AppConfig {

	@Bean
	public HelloController helloController()
	{
		return new HelloController();
	}
}
