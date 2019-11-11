package com.oman.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oman.model.Persona;


public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	
}
