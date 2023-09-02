package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.MatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	@Autowired
	private MatriculaService matriculaService;
	
	@GetMapping("/ingreso")
    public String vistaMatricula(Matricula matricula){
		return "vistaMatricula";
	}
        
	
	@PostMapping("/igresar")
	public String crearInventario(@RequestParam("cedula")String cedula,@RequestParam("codigo")String codigo1,@RequestParam("codigo")String codigo2,@RequestParam("codigo")String codigo3,@RequestParam("codigo")String codigo4) {
		this.matriculaService.agregar(cedula, codigo1, codigo2, codigo3, codigo4);
		return "redirect:/inventarios/ingreso";
		
	}
	
	
	@PutMapping("/reporte")
	public String ingresarMateria(Materia materia) {
		this.matriculaService.agendaTodos();
		return "VistaReporte";
	}
	

}
