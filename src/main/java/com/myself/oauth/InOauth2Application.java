package com.myself.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class InOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(InOauth2Application.class, args);
	}
}
