package com.soaint.service;
import java.util.List;
import java.util.Optional;

import com.soaint.model.Parametros;
public interface IParametrosService {
	List<Parametros> list();
	void add(Parametros parametros);
	void update(Parametros parametros);
	void delete(int id);
	Optional<Parametros> findByIdObj(int id);
}