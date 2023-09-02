package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.repository.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements matriculaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void ingresar(Matricula matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public Matricula buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Matricula> query = this.entityManager.createQuery("SELECT e FROM Estudiante e JOIN e.materia WHERE m.codigo=:m.DatoCodigo", Matricula.class);
		query.setParameter("DatoCodigo", codigo);
		return query.getSingleResult();
	}

	@Override
	public List<Matricula> reporteTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Matricula> query = this.entityManager.createQuery("SELECT e FROM Matricula ", Matricula.class);
		return query.getResultList();
	}
	
	

}
