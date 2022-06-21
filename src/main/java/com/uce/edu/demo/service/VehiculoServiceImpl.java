package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(v);
	}

	@Override
	public Vehiculo buscar(String modelo) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscar(modelo);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizar(v);
	}

	@Override
	public void eliminar(String modelo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(modelo);
	}

}
