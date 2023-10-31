package com.company.assesment.entity;

import javax.xml.crypto.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "employees")
public class Employee {
	 private long id;
	    private String firstName;
	    private String lastName;
	    private String emailId;
	    private Long phoneNumber;
	    private Data dOJ;
	    private double salary;
	    
	    public Long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Data getdOJ() {
			return dOJ;
		}

		public void setdOJ(Data dOJ) {
			this.dOJ = dOJ;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Employee() {

	    }

	    public Employee(String firstName, String lastName, String emailId) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.emailId = emailId;
	    }

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public long getId() {
	        return id;
	    }
	    public void setId(long id) {
	        this.id = id;
	    }

	    @Column(name = "first_name", nullable = false)
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    @Column(name = "last_name", nullable = false)
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    @Column(name = "email_address", nullable = false)
	    public String getEmailId() {
	        return emailId;
	    }
	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }

}
