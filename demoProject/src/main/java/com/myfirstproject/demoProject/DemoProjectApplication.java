package com.myfirstproject.demoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication implements CommandLineRunner {

    //This will work because we are clearly making object in memory.
    //Apple obj1 = new Apple();

	//This will not work and will throw NullPointerException because
	//The Apple object (obj2) was declared but not initialized.
    //Apple obj2;

	//Autowired annotation will inform the framework that this object should be
	//injected where ever it is required
	//@Autowired
    //Apple obj;


	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {

		//obj.eatApple();


		System.out.println(dbService.getData());



	}

}
