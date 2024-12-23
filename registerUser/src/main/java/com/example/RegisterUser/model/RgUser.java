package com.example.RegisterUser.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="ContactDb")
@NoArgsConstructor
@AllArgsConstructor
public class RgUser {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String firstName;
	

	private String lastName;


	private String country;
	

	private String designation;
	

	private String company;
	

	private String email;
	

	private String phone ;
	
	
	private String industry;
	

	private String message;
	
	@Column(name = "date_created")
	private LocalDate dateCreated;

	public RgUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RgUser(int id, String firstName, String lastName, String country, String designation, String company,
			String email, String phone, String industry, String message, LocalDate dateCreated) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.designation = designation;
		this.company = company;
		this.email = email;
		this.phone = phone;
		this.industry = industry;
		this.message = message;
		this.dateCreated = dateCreated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "RgUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", designation=" + designation + ", company=" + company + ", email=" + email + ", phone=" + phone
				+ ", industry=" + industry + ", message=" + message + ", dateCreated=" + dateCreated + "]";
	}

	

}
