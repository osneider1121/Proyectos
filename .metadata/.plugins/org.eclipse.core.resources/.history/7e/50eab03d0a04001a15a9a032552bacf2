package com.oman;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.oman.model.Usuario;
import com.oman.repo.IUsuarioRepo;

@SpringBootTest
class DemoWebApplicationTests {
	@Autowired
	private IUsuarioRepo repo;
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Test
	void crearUsuarioTest() {
		Usuario us= new Usuario();
		us.setId(4);
		us.setClave(encoder.encode("123"));
		us.setNombre("osnedier4");
		
		Usuario retorno=repo.save(us);
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
