package com.test.edj.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetDataByCountryCodeRes {
	
	private String firstName;
	private String email;
	
	public GetDataByCountryCodeRes(String firstName, String email) {
	    this.firstName = firstName;
	    this.email = email;
	}


}
