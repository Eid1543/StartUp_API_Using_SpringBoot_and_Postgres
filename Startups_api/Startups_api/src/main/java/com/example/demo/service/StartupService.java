package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Startup;
import com.example.demo.repository.StartupRepository;

@Service
@Transactional
public class StartupService {

	
    private final StartupRepository startupRepo;

    @Autowired
    public StartupService(StartupRepository startupRepo) {
        this.startupRepo = startupRepo;
    }
    
    
    public List<Startup> findAllStartups() {
        return startupRepo.findAll();
    }
    
    
    public Startup findStartupById(Long id) {
        return startupRepo.findStartupById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
    
    
    public Startup addStartup(Startup startup) { 
        return startupRepo.save(startup);
    }
 
    
    public Startup updateStartup(Startup startup) {
        return startupRepo.save(startup);
    }
    
    
    
    public void deleteStartup(Long id){
    	startupRepo.deleteStartupById(id);
    }
    
    
    
    
    
    
	
	
	
}
