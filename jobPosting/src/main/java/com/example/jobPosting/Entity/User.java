package com.example.jobPosting.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "jobPosting")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title cannot be blank")
    @Column(name = "title", nullable = false)
    private String title;

    @NotBlank(message = "Location cannot be blank")
    @Column(name = "location", nullable = false)
    private String location;

    @NotBlank(message = "Category cannot be blank")
    @Column(name = "category", nullable = false)
    private String category;

    @NotBlank(message = "Employment Type cannot be blank")
    @Column(name = "employmentType", nullable = false)
    private String employmentType;

    @NotBlank(message = "Work Model cannot be blank")
    @Column(name = "workModel", nullable = false)
    private String workModel;

    @NotBlank(message = "Experience cannot be blank")
    @Column(name = "experience", nullable = false)
    private String experience;

    @NotBlank(message = "Salary cannot be blank")
    @Column(name = "salary", nullable = false)
    private String salary;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, @NotBlank(message = "Title cannot be blank") String title,
			@NotBlank(message = "Location cannot be blank") String location,
			@NotBlank(message = "Category cannot be blank") String category,
			@NotBlank(message = "Employment Type cannot be blank") String employmentType,
			@NotBlank(message = "Work Model cannot be blank") String workModel,
			@NotBlank(message = "Experience cannot be blank") String experience,
			@NotBlank(message = "Salary cannot be blank") String salary) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.category = category;
		this.employmentType = employmentType;
		this.workModel = workModel;
		this.experience = experience;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getWorkModel() {
		return workModel;
	}

	public void setWorkModel(String workModel) {
		this.workModel = workModel;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", title=" + title + ", location=" + location + ", category=" + category
				+ ", employmentType=" + employmentType + ", workModel=" + workModel + ", experience=" + experience
				+ ", salary=" + salary + "]";
	}

    
    
    
}