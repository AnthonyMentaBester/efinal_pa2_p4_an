package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;



@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	@GetMapping("/ingreso")
	public String vistaEstudiante(Estudiante estudiante) {
		return "VistaEstudiante";
	}
	
	@PostMapping("/ingresar")
	public String ingresarEstudiante(Estudiante estudiante) {
		this.estudianteService.agregar(estudiante);
		return "redirect:/estudiantes/ingreso";
	}

}
