package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Vehiculo;

public interface IVehiculoService {

	public void insertar(Vehiculo v);

	public Vehiculo buscar(String modelo);

	public void actualizar(Vehiculo v);

	public void eliminar(String modelo);
}
