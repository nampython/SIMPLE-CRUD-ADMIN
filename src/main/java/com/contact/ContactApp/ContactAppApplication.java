package com.contact.ContactApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.contact.ContactApp")
public class ContactAppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ContactAppApplication.class, args);
	  }

}
