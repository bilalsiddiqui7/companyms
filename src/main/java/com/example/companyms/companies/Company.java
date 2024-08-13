package com.example.companyms.companies;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;

	private List<Long> jobIds;

	private List<Long> reviewIds;

	public Company() {
		super();
	}

	public Company(long id, String name, String description, List<Long> jobIds, List<Long> reviewIds) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.jobIds = jobIds;
		this.reviewIds = reviewIds;
	}

	public List<Long> getJobIds() {
		return jobIds;
	}

	public void setJobIds(List<Long> jobIds) {
		this.jobIds = jobIds;
	}

	public List<Long> getReviewIds() {
		return reviewIds;
	}

	public void setReviewIds(List<Long> reviewIds) {
		this.reviewIds = reviewIds;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
