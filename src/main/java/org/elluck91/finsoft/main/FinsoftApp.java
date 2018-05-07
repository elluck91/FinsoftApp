package org.elluck91.finsoft.main;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@EnableOAuth2Sso
@Controller
@EnableJpaRepositories(basePackages = "org.elluck91.finsoft.main.repository")
public class FinsoftApp {
	public static void main(String[] args) {
		SpringApplication.run(FinsoftApp.class, args);
	}
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
	public String echoTheUsersEmailAddress(Principal principal) {
//	   return "Hey there! Your email address is: " + principal.getName();
		return "dashboard";
	}
}
