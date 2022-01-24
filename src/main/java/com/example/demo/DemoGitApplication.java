package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGitApplication.class, args);
		System.out.println("test dev fix bug");

		System.out.println("test2111 dev fix bug");
		System.out.println("test333 dev fix bug");
		
		System.out.println("add something to bug fix branch");
		System.out.println("add something11 to bug fix branch");
		System.out.println("see remote tracking");

	}

}
