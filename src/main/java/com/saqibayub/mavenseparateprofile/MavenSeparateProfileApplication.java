package com.saqibayub.mavenseparateprofile;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenSeparateProfileApplication {

	@Value("${profile.name}")
	String profileName;
	public static void main(String[] args) {
		SpringApplication.run(MavenSeparateProfileApplication.class, args);
	}
	@GetMapping(path="/")
	public String getProfileName() {
		
		return profileName;
	}
}
