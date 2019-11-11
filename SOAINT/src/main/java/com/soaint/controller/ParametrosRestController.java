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

import com.soaint.model.Parametros;
import com.soaint.model.Parametros;
import com.soaint.service.IParametrosService;
import com.soaint.service.IParametrosService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/Parametros")
public class ParametrosRestController {
	@Autowired
	private IParametrosService service;
	
	@GetMapping
	public List<Parametros> list() {
		return service.list();
	}

	@PostMapping
	public void add(@RequestBody Parametros parametros) {
		service.add(parametros);
	}

	@PutMapping
	public void update(@RequestBody Parametros parametros) {
		service.update(parametros);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}

	@GetMapping(value = "/{id}")
	public Optional<Parametros> findByIdObj(@PathVariable("id") int id) {
		return service.findByIdObj(id);
	}
}
