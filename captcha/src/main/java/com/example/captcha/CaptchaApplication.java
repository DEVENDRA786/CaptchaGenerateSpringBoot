package com.example.captcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class CaptchaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaptchaApplication.class, args);
	}

}
