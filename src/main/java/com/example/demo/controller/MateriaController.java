package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.MateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	private MateriaService materiaService;
	
	@GetMapping("/ingreso")
	public String vistaMateria(Materia materia) {
		return "VistaMateria";
	}
	
	@PostMapping("/ingresar")
	public String ingresarMateria(Materia materia) {
		this.materiaService.agregar(materia);
		return "redirect:/materias/ingreso";
	}
	
	
	
	

}
