package com.test.edj.controller;

import com.test.edj.entity.EdjTestEntity;
import com.test.edj.entity.GetDataByCountryCodeRes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.edj.repository.EdjTestRepository;

@RestController
public class EdjTestController {
	
	@Autowired
	private EdjTestRepository edjTestRepository;
	
	@GetMapping("/getAllFinancialAdvisorData")
	public List<EdjTestEntity> getAllFinancialAdvisorData() {
		return edjTestRepository.findAll();
	}
	
//    public List<GetDataByCountryCodeRes> getDataByCountryCode() {
//        return edjTestRepository.findFAbyCountry("USA");
//    }

}
