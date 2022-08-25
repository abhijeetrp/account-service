package com.maveric.accountservice;

import com.maveric.accountservice.Model.Customer;
import com.maveric.accountservice.Repository.customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(AccountServiceApplication.class, args);
	}



}
