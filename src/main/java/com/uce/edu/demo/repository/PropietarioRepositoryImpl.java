package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Propietario;

@Repository
@Transactional
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("Delete from Propietario p where p.cedula = :cedula");
		query.setParameter("cedula", cedula);
		query.executeUpdate();
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Propietario> query = this.entityManager.createQuery("Select p from Propietario p where p.cedula = :cedula", Propietario.class);
		query.setParameter("cedula", cedula);
		return query.getSingleResult();
	}

}