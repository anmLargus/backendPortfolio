package com.ap.backendPortfolio.controllers;

// import java.util.ArrayList;
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

import com.ap.backendPortfolio.models.Educacion;
import com.ap.backendPortfolio.services.EducacionService;


@CrossOrigin("*") //(origins = "http://localhost:4200")
@RestController
public class EduController {
	
	@Autowired
	private EducacionService educacionService;
	
	@GetMapping("/edus")
	public List<Educacion> getAll() {
		return educacionService.traerTodo(); // return new ArrayList<Educacion>();
	}
	
	@GetMapping("/edus/{id}")
	public Educacion getOne(@PathVariable int id) {
		return educacionService.traerUno(id); // return new Educacion();
	}
	
	@PostMapping("/edus")
	public boolean create(@RequestBody Educacion ed) {		
		return educacionService.crear(ed);
	}
	
	@PutMapping("/edus")
	public boolean update(@RequestBody Educacion ed) {
		return educacionService.modificar(ed);
	}
	
	@DeleteMapping("edus/{id}")
	public boolean remove(@PathVariable int id) {
		return educacionService.borrar(id);
	}		

}
