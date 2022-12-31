package io.dio.domain;

import java.time.LocalDate;

public class Mentory {

	private String title;
	private String description;
	LocalDate date;
	
	public Mentory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mentory(String title, String description, LocalDate date) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
