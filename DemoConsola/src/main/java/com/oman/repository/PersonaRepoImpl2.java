package com.oman.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.oman.DemoConsolaApplication;
@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersonaRepo{
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		LOG.info("el nombrE es B:"+nombre);
	}

}

