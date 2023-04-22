package com.Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Addition.calculation.Sum;

@SpringBootApplication
public class ClientapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientapplicationApplication.class, args);
		
		Sum sum=new Sum();
		int sum2 = sum.sum(10, 20);
		System.out.println("This is result from client addition: "+sum2);
		
	}
	
	
	public String getfirstmsg() 
	{
	
		return "welcome to company";
		
	}
  
}
