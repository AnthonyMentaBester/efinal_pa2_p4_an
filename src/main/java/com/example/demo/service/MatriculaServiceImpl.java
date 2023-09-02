package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepository;
import com.example.demo.repository.MateriaRepository;
import com.example.demo.repository.matriculaRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private matriculaRepository matriculaRepository;

	@Autowired
	private EstudianteRepository estudianteRepository;

	@Autowired
	private MateriaRepository materiaRepository;

	@Override
	public void agregar(String cedula, String codigo1, String codigo2, String codigo3, String codigo4) {
		// TODO Auto-generated method stub
		Estudiante estudianteActual = this.estudianteRepository.buscarPorCedula(cedula);
		Materia materiaActual1 = this.materiaRepository.buscarPorCodigo(codigo1);
		Materia materiaActual2 = this.materiaRepository.buscarPorCodigo(codigo2);
		Materia materiaActual3 = this.materiaRepository.buscarPorCodigo(codigo3);
		Materia materiaActual4 = this.materiaRepository.buscarPorCodigo(codigo4);	

		Matricula matricula1 = new Matricula();
		matricula1.setMateria(materiaActual1);
		
		Matricula matricula2 = new Matricula();
		matricula2.setMateria(materiaActual2);
		
		Matricula matricula3 = new Matricula();
		matricula3.setMateria(materiaActual3);
		
		Matricula matricula4 = new Matricula();
		matricula4.setMateria(materiaActual4);	

		List<Matricula> listaMatriculas = new ArrayList<>();
		
		listaMatriculas.add(matricula1);
		listaMatriculas.add(matricula2);
		listaMatriculas.add(matricula3);
		listaMatriculas.add(matricula4);
		
	
		this.estudianteRepository.actualizar(estudianteActual);
		this.materiaRepository.actualizar(materiaActual1);
		this.materiaRepository.actualizar(materiaActual2);
		this.materiaRepository.actualizar(materiaActual3);
		this.materiaRepository.actualizar(materiaActual4);
	}

	@Override
	public Matricula buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscarPorCodigo(codigo);
	}

	@Override
	public List<Matricula> agendaTodos() {
		// TODO Auto-generated method stub
		return this.matriculaRepository.reporteTodos();
	}

}
