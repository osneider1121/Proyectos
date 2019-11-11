package com.soaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soaint.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
