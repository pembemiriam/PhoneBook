package com.pembe.angular;

import com.pembe.angular.repositories.ContactRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication

public class AngularApplication {



	public static void main(String[] args) {
		SpringApplication.run(AngularApplication.class, args);
	}




	}



