package com.example.dependencyinj;

import com.example.dependencyinj.controllers.ConstructorInjectedController;
import com.example.dependencyinj.controllers.MyController;
import com.example.dependencyinj.controllers.PropertyInjectedController;
import com.example.dependencyinj.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class DependencyInjApplication {

	public static void main(String[] args) {

		ApplicationContext appCxt = SpringApplication.run(DependencyInjApplication.class, args);
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
