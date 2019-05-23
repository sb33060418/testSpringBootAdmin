package com.sunbin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import de.codecentric.boot.admin.server.config.EnableAdminServer;


@SpringBootApplication
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
@EnableScheduling
@EnableAdminServer
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
