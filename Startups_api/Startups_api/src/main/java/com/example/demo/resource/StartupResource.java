package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Startup;
import com.example.demo.service.StartupService;

@RestController
@RequestMapping(path="api/v1/startups")
public class StartupResource {

	@Autowired
    private final StartupService startupService;

    public StartupResource(StartupService startupService) {
        this.startupService = startupService;
    }
    
    
    
    @GetMapping("/all")
    public ResponseEntity<List<Startup>> getAllStartups () {
        List<Startup> startups = startupService.findAllStartups();
        return new ResponseEntity<>(startups, HttpStatus.OK);
    }
    
    

    @GetMapping("/find/{id}")
    public ResponseEntity<Startup> getStartupById (@PathVariable("id") Long id) {
    	Startup startup = startupService.findStartupById(id);
        return new ResponseEntity<>(startup, HttpStatus.OK);
    }
    
    
    @PostMapping("/add")
    public ResponseEntity<Startup> addStartup(@RequestBody Startup startup) {
    	Startup newStartup = startupService.addStartup(startup);
        return new ResponseEntity<>(newStartup, HttpStatus.CREATED);
    }
    
    
    @PutMapping("/update")
    public ResponseEntity<Startup> updateStartup(@RequestBody Startup startup) {
    	Startup updateStartup = startupService.updateStartup(startup);
        return new ResponseEntity<>(updateStartup, HttpStatus.OK);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStartup(@PathVariable("id") Long id) {
    	startupService.deleteStartup(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
    
}
