package com.ap.backendPortfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.backendPortfolio.models.Persona;
import com.ap.backendPortfolio.services.PersonaService;

@CrossOrigin("*")
@RestController
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/personas")
	public List<Persona> getAll() {
		return personaService.traerTodo();
	}
	
	@GetMapping("/personas/{id}")
	public Persona getOne(@PathVariable int id) {
		return personaService.traerUno(id);
	}
	
	// NO SE CREARÁN USUARIOS. HAY UN SOLO USUARIO AL CUAL SE LE PUEDE MODIFICAR
	  @PostMapping("/personas") public boolean create(@RequestBody Persona p) {
	  return personaService.crear(p); }
	 
	
	@PutMapping("/personas")
	public boolean update(@RequestBody Persona p) {
		return personaService.modificar(p);
	}
	
	/* NO SE BORRAN USUARIOS. 
	 * @DeleteMapping("/personas/{id}") public boolean remove(@PathVariable int id)
	 * { return personaService.borrar(id); }
	 */


}
