package com.test.edj.controller;

import com.test.edj.entity.EdjTestEntity;
import com.test.edj.entity.GetDataByCountryCodeRes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@GetMapping("/getAllFADataByRegion/{regionParam}")
	public List<EdjTestEntity> getAllFinancialAdvisorDataByRegion(@PathVariable("regionParam") String regionParam) {
		return edjTestRepository.findFAbyRegion(regionParam);
	}
	
	@GetMapping("/getAllFADataByAdvisorId/{id}")
	public List<EdjTestEntity> getAllFinancialAdvisorDataByAdvisorID(@PathVariable("id") Integer id) {
		return edjTestRepository.findFAbyAdvisorID(id);
	}
	
//    public List<GetDataByCountryCodeRes> getDataByCountryCode() {
//        return edjTestRepository.findFAbyCountry("USA");
//    }

}
