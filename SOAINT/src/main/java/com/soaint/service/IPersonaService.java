package com.soaint.service;

import java.util.List;
import java.util.Optional;

import com.soaint.model.Persona;

public interface IPersonaService {
	List<Persona> list();
	void add(Persona persona);
	void update(Persona persona);
	void delete(int id);
	Optional<Persona> findByIdObj(int id);
}
