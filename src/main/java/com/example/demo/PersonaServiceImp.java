package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class PersonaServiceImp implements PersonaService {
	@Autowired
	private PersonaRepositorio repositorio ;

	@Override
	public List<Persona> listar() {
	return  repositorio.findAll();
	}

	@Override
	public Persona listarId(int id) {
		
		return null;
	}

	@Override
	public Persona add(Persona p) {
		// TODO Auto-generated method stub
		return repositorio.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		
		return repositorio.save(p);
	}

	@Override
	public Persona delete(int cedula) {
		Persona p = repositorio.findById(cedula);
		if(p!= null) {
			repositorio.delete(p);
		}
		return null;
	}

}
