package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un nuevo Propietario: " + p);
	}

	@Override
	public Propietario buscar(String nombre) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setCedula("17561465");
		return p;
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el Propietario: " + p);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado un Propietario: " + nombre);
	}

}
