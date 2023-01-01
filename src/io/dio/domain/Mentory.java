package io.dio.domain;

import java.time.LocalDate;

public class Mentory extends Content {

	LocalDate date;

	public Mentory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double experienceCalculate() {
		return EXPERIENCE_DEFAULT + 20;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mentory [title=" + getTitle() + ", description=" + getDescription() + ", date=" + date + "]";
	}

}
