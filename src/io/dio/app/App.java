package io.dio.app;

import java.time.LocalDate;

import io.dio.domain.Course;
import io.dio.domain.Mentory;

public class App {

	public static void main(String[] args) {

		Course course = new Course();
		course.setTitle("Java");
		course.setDescription("Java Bootcamp DIO Inter");
		course.setWorkload(25);
		
		Mentory mentory = new Mentory();
		mentory.setTitle("CCp 50");
		mentory.setDescription("Mentoria para devs de verdade");
		mentory.setDate(LocalDate.now());
		
		System.out.println(course);
		System.out.println(mentory);
	}
}
