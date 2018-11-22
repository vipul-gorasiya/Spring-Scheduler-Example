package com.vipul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class SpringSchedulerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedulerExampleApplication.class, args);
	}
	
	@Scheduled(fixedDelay=5000)
	public void printMessage(){
		System.out.println("Hello ");
	}
}
