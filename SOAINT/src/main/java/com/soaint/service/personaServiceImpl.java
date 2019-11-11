package com.soaint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soaint.model.Persona;
import com.soaint.repository.IPersonaRepo;
import java.util.List;
import java.util.Optional;
@Service
public class personaServiceImpl implements IPersonaService{
	@Autowired
 	private IPersonaRepo repo;

	@Override
	public List<Persona> list() {
		return repo.findAll();
	}

	@Override
	public void add(Persona persona) {
		repo.save(persona);
	}

	@Override
	public void update(Persona persona) {
		repo.save(persona);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

	@Override
	public Optional<Persona> findByIdObj(int id) {
		return repo.findById(id);
	}

	
}
