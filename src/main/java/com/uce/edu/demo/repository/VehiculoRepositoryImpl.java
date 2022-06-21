package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un vehiculo: " + v);
	}

	@Override
	public Vehiculo buscar(String modelo) {
		// TODO Auto-generated method stub
		Vehiculo v =  new Vehiculo();
		v.setMarca("Chevrolet");
		v.setPlaca("14234");
		v.setPrecio(new BigDecimal(25000));
		v.setTipo("L");
		return v;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vehiculo: " + v);
	}

	@Override
	public void eliminar(String modelo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehiculo: " + modelo);
	}

}
