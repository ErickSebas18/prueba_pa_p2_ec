package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Vehiculo;

@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("Update Vehiculo v set v.precio = :precio, v.tipo = :tipo where v.placa = :placa");
		query.setParameter("precio", vehiculo.getPrecio());
		query.setParameter("tipo", vehiculo.getTipo());
		query.setParameter("placa", vehiculo.getPlaca());
		query.executeUpdate();
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("Delete from Vehiculo v where p.placa = :placa");
		query.setParameter("placa", placa);
		query.executeUpdate();
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Vehiculo> query = this.entityManager.createQuery("Select v from Vehiculo v where v.placa = :placa", Vehiculo.class);
		query.setParameter("placa", placa);
		return query.getSingleResult();
	}

}
