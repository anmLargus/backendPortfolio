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

import com.ap.backendPortfolio.models.Project;
import com.ap.backendPortfolio.services.ProjectService;

@CrossOrigin("*")
@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/proyectos")
	public List<Project> getAll() {
		return projectService.traerTodo();
	}
	
	@GetMapping("/proyectos/{id}")
	public Project getOne(@PathVariable int id) {
		return projectService.traerUno(id);
	}
	
	@PostMapping("/proyectos")
	public boolean create(@RequestBody Project pr) {
		return projectService.crear(pr);
	}
	
	@PutMapping("/proyectos")
	public boolean update(@RequestBody Project pr) {
		return projectService.modificar(pr);
	}
	
	@DeleteMapping("/proyectos/{id}")
	public boolean remove(@PathVariable int id) {
		return projectService.borrar(id);
	}
}
