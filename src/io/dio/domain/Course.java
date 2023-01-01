package io.dio.domain;

public class Course extends Content {

	private int workload;

	public Course() {

	}

	@Override
	public double experienceCalculate() {
		// TODO Auto-generated method stub
		return EXPERIENCE_DEFAULT * workload;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return "Course [title=" + getTitle() + ", description=" + getDescription() + ", workload=" + workload + "]";
	}

}
