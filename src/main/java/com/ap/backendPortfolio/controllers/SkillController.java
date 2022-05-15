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

import com.ap.backendPortfolio.models.Skill;
import com.ap.backendPortfolio.services.SkillService;

@CrossOrigin(origins = "*") //  *Es para evitar el rechazo por CrossDomain*
@RestController
public class SkillController {
	
	@Autowired
	private SkillService skillService;
	
	@GetMapping("/skills")
	public List<Skill> getAll() {
		return skillService.traerTodo();
	}
	
	@GetMapping("/skills/{id}")
	public Skill getOne(@PathVariable int id) {
		return skillService.traerUno(id);
	}
	
	@PostMapping("/skills")
	public boolean create(@RequestBody Skill s) {
		return skillService.crear(s);
	}
	
	@PutMapping("/skills")
	public boolean update(@RequestBody Skill s) {
		return skillService.modificar(s);
	}

	@DeleteMapping("/skills/{id}") 
		public boolean remove(@PathVariable int id) {
		return skillService.borrar(id);
	}
}
