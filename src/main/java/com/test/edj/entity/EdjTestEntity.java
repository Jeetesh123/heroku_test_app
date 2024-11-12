package com.test.edj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "financialadvisordata", schema ="edj_advisor_test")
@Getter
@Setter

public class EdjTestEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int advisor_id;
	
	private String first_name;
	
	private String last_name;
	
	private String email;
	
	private long phone_number;
	
	private int base_salary;
	
	private int commission;
	
	private int total_clients_managed;
	
	private String country;
	
	private String advisor_status;

	public int getAdvisor_id() {
		return advisor_id;
	}

	public void setAdvisor_id(int advisor_id) {
		this.advisor_id = advisor_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public int getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(int base_salary) {
		this.base_salary = base_salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getTotal_clients_managed() {
		return total_clients_managed;
	}

	public void setTotal_clients_managed(int total_clients_managed) {
		this.total_clients_managed = total_clients_managed;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAdvisor_status() {
		return advisor_status;
	}

	public void setAdvisor_status(String advisor_status) {
		this.advisor_status = advisor_status;
	}
	
	

}
