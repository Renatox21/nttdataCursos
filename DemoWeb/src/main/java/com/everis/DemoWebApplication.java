package com.everis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableCaching
@SpringBootApplication
public class DemoWebApplication implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
		System.out.println("----Termino");
	}

	@Override
	public void run(String... args) throws Exception {
		String pass1 = "user";
		String pass2 = "admin";
		
		System.out.println(passEncoder.encode(pass1));
		System.out.println(passEncoder.encode(pass2));
	}

}
