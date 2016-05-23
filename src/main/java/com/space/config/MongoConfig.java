package com.space.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by asus-pc on 24.05.2016.
 */

@Configuration
@EnableMongoRepositories("com.space.data.repository")
public class MongoConfig extends AbstractMongoConfiguration {

    @Value("${spring.application.name}")
    private String proAppName;

    @Value("${spring.data.mongodb.host}")
    private String mongoHost;

    @Value("${spring.data.mongodb.port}")
    private String mongoPort;

    @Value("${spring.data.mongodb.database}")
    private String mongoDB;

    @Value("${spring.data.mongodb.login}")
    private String mongoDBLogin;

    @Value("${spring.data.mongodb.password}")
    private String mongoDBPassword;

    @Override
    protected String getDatabaseName() {
        return mongoDB;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(mongoHost + ":" + mongoPort);
    }
}
