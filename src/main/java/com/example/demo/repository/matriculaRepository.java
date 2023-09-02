package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;

public interface matriculaRepository {

	public void ingresar(Matricula matricula);
	public Matricula buscarPorCodigo(String codigo);
	public List<Matricula> reporteTodos();
 }
