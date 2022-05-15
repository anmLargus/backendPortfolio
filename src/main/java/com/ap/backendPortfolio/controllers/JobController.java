package com.ap.backendPortfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.backendPortfolio.models.Job;
import com.ap.backendPortfolio.services.JobService;

@CrossOrigin("*")
@RestController
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@GetMapping("/jobs")
	public List<Job> getAll() {
		return jobService.traerTodo();
	}
	
	@GetMapping("/jobs/{id}")
	public Job getOne(@PathVariable int id) {
		return jobService.traerUno(id);
	}
	
	@PostMapping("/jobs")
	public boolean create(@RequestBody Job j) {
		return jobService.crear(j);
	}
	
	@PutMapping("/jobs")
	public boolean update(@RequestBody Job j) {
		return jobService.modificar(j);
	}
	
	@DeleteMapping("/jobs/{id}")
	public boolean remove(@PathVariable int id) {
		return jobService.borrar(id); 
	}

}
