package com.inno.FreshWebSocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.inno.*")
@EntityScan(basePackages="com.inno.entity")
@AutoConfigurationPackage
@SpringBootApplication
public class FreshWebSocialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshWebSocialApplication.class, args);
	}
}
