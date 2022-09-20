package com.example.springAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAssignmentApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(SpringAssignmentApplication.class, args);

		Message expobj = context.getBean(Message.class);
		expobj.express("Hi i am Gouthami");

		Message2 expobj2 = context.getBean(Message2.class);
		expobj2.express1("i am working on spring");

		Countingstring obj=context.getBean(Countingstring.class);
		obj.express3("Hi i am Gouthami","i am working on spring");

	}

}
//	Take a string convert to lower, upper,
//	count the number of characters based on upper, lower.
//	The string is a mix of all upper and lower case.
//	Finally find the sum of the entire string.
