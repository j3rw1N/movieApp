package com.stackroute.tmdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class TmdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmdbApplication.class, args);
	}

}
