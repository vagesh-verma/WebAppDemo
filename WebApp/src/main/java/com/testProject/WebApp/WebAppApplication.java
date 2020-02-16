package com.testProject.WebApp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.testProject")
@SpringBootApplication
public class WebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner( ApplicationContext ctx )
	{
		return args -> {
			System.out.println("We have following beans in our path");
			String [] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort( beanNames );
			for(String beanName : beanNames) {
				System.out.println( beanName);
			}
		};
	}
}
