package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MateriaRepository;
import com.example.demo.repository.modelo.Materia;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
@Transactional
public class MateriaServiceImpl implements MateriaService{

	@Autowired
	private MateriaRepository materiaRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void agregar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(materia);
	}
	
	

}
