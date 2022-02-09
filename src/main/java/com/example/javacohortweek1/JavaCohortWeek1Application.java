package com.example.javacohortweek1;

import org.joda.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCohortWeek1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaCohortWeek1Application.class, args);
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
	}

}
