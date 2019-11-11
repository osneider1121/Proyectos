package com.soaint.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soaint.model.Persona;
import com.soaint.service.IPersonaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/Persona")
public class PersonaRestController {
	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public List<Persona> list() {
		return service.list();
	}

	@PostMapping
	public void add(@RequestBody Persona persona) {
		service.add(persona);
	}

	@PutMapping
	public void update(@RequestBody Persona persona) {
		service.update(persona);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}

	@GetMapping(value = "/{id}")
	public Optional<Persona> findByIdObj(@PathVariable("id") int id) {
		return service.findByIdObj(id);
	}
}
