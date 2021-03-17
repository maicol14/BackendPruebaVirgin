package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class controlador {
	
	@Autowired
	PersonaService servicePer;
	
	
	@GetMapping
	public List<Persona>listar(){
		return servicePer.listar();
	}
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		
		return servicePer.add(p); 
	}
	@GetMapping(path = {"/{id}"})
	public Persona listarId(@PathVariable("id")int id ){
		return servicePer.listarId(id);
		
	}
	@PutMapping(path = {"/{id}"})
	public Persona  editar(@RequestBody Persona p, @PathVariable("id")int id) {
		p.setId(id);
		return servicePer.edit(p);
	}
	
	@DeleteMapping(path = {"/{cedula}"})
	
	public Persona delete(@PathVariable("cedula")int cedula) {
		return servicePer.delete(cedula);
	}

}
