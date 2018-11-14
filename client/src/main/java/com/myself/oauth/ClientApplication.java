package com.myself.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
@Configuration
@EnableOAuth2Sso
@RestController
public class ClientApplication {

	@RequestMapping("/")
	public String home(Principal user) {
		System.out.println("Hello " + user.getName());
		return "Hello " + user.getName();
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}


}
