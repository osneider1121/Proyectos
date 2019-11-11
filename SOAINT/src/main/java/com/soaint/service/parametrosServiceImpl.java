package com.soaint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soaint.model.Parametros;
import com.soaint.repository.IParametrosRepo;

import java.util.List;
import java.util.Optional;
@Service
public class parametrosServiceImpl implements IParametrosService {
	@Autowired
	private IParametrosRepo repo;

	@Override
	public List<Parametros> list() {
		return repo.findAll();
	}

	@Override
	public void add(Parametros parametros) {
		repo.save(parametros);
		
	}

	@Override
	public void update(Parametros parametros) {
		repo.save(parametros);
		
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public Optional<Parametros> findByIdObj(int id) {
		return repo.findById(id);
	}
	
	

}
