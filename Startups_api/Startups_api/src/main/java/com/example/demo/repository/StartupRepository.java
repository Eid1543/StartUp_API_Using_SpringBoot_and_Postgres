package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Startup;

@Repository
public interface StartupRepository extends JpaRepository<Startup, Long> {

	
	void deleteStartupById(Long id);
	
    Optional<Startup> findStartupById(Long id);
	
	
	
}
