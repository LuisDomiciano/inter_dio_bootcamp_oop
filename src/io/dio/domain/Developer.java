package io.dio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Developer {
	
	private String name;
	private Set<Content> contentSubscribed = new LinkedHashSet<>();
	private Set<Content> completedContents = new LinkedHashSet<>();
	
	public void bootcampSubscribe(Bootcamp bootcamp) {
		
	}
	
	public void progress() {
		
	}
	
	public void totalExperienceCalculate() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getContentSubscribed() {
		return contentSubscribed;
	}

	public void setContentSubscribed(Set<Content> contentSubscribed) {
		this.contentSubscribed = contentSubscribed;
	}

	public Set<Content> getCompletedContents() {
		return completedContents;
	}

	public void setCompletedContents(Set<Content> completedContents) {
		this.completedContents = completedContents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(completedContents, contentSubscribed, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		return Objects.equals(completedContents, other.completedContents)
				&& Objects.equals(contentSubscribed, other.contentSubscribed) && Objects.equals(name, other.name);
	}

	
	
}
