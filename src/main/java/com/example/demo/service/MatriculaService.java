package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaService {
	public void agregar(String cedula,String codigo1,String codigo2,String codigo3,String codigo4);
	public Matricula buscarPorCodigo(String codigo);
	public List<Matricula> agendaTodos();
	
}
