package com.example.dependencyinj;

import com.example.dependencyinj.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjApplication {

	public static void main(String[] args) {

		ApplicationContext appCxt = SpringApplication.run(DependencyInjApplication.class, args);
		MyController ctrl = (MyController)appCxt.getBean("myController");
		System.out.println(ctrl.sayHello());
	}

}
