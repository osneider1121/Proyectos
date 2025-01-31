package com.oman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oman.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	Usuario findByNombre(String nombre);
}
