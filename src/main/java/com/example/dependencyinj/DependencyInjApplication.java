package com.example.dependencyinj;

import com.example.dependencyinj.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class DependencyInjApplication {

	public static void main(String[] args) {

		ApplicationContext appCxt = SpringApplication.run(DependencyInjApplication.class, args);

		PetController petController = appCxt.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		MyController ctrl = (MyController)appCxt.getBean("myController");
		System.out.println(ctrl.sayHello());

		PropertyInjectedController propCtrl = (PropertyInjectedController) appCxt.
				getBean("propertyInjectedController");

		System.out.println("--------------------property-----------------------");
		System.out.println(propCtrl.getGreetings());

		SetterInjectedController setterCtrl = (SetterInjectedController) appCxt.
				getBean("setterInjectedController");

		System.out.println("--------------------Setter-----------------------");
		System.out.println(setterCtrl.getGreetings());

		ConstructorInjectedController consCtrl = (ConstructorInjectedController) appCxt.
				getBean("constructorInjectedController");

		System.out.println("--------------------Constructor-----------------------");
		System.out.println(consCtrl.getGreetings());
	}

}
