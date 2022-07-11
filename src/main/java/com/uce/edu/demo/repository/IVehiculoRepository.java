package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Vehiculo;

public interface IVehiculoRepository {

	public void insertar(Vehiculo v);

	public Vehiculo buscar(String modelo);

	public void actualizar(Vehiculo v);

	public void eliminar(String modelo);

}
