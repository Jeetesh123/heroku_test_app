package com.test.edj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.edj.entity.EdjTestEntity;
import com.test.edj.entity.GetDataByCountryCodeRes;

@RepositoryDefinition(domainClass = EdjTestEntity.class, idClass = Integer.class)
public interface EdjTestRepository extends JpaRepository<EdjTestEntity, Integer> {
	
//	@Query("SELECT new com.test.edj.GetDataByCountryCodeRes(e.firstName, e.email) " +
//	           "FROM financialadvisordata e WHERE e.country = :country")
//	    
//	List<GetDataByCountryCodeRes> findFAbyCountry(@Param("country") String country);
	
	
	@Query("SELECT e FROM EdjTestEntity e WHERE e.region = :region")
	List<EdjTestEntity> findFAbyRegion(@Param("region") String region);
	
	@Query("SELECT e FROM EdjTestEntity e WHERE e.advisor_id = :advisor_id")
	List<EdjTestEntity> findFAbyAdvisorID(@Param("advisor_id") Integer advisor_id);
	
	

}
