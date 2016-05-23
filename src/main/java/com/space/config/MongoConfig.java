package com.space.config;

import com.space.controller.ByController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ivan Timofeev on 23.05.2016.
 */

@Configuration
public class MongoConfig {

	@Bean
	public ByController byController()
	{
		return new ByController();
	}

}
