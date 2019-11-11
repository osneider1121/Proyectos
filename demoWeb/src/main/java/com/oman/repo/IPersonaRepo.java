package com.oman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oman.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
