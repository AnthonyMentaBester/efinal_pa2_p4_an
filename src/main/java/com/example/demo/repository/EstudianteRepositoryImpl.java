package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
		
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.cedula =:e.DatoCedula", Estudiante.class);
		query.setParameter("DatoCedula", cedula);
		return query.getSingleResult();
	}

}
