package com.cos.baseballspring.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.baseballspring.domain.stadium.Stadium;

public interface StadiumRepository extends JpaRepository<Stadium, Integer>{

}
