package com.uce.edu.demo.service;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	
	@Override
	public void crearPropietario(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un propietario: " + p);
	}

	@Override
	public void eliminarPropietario(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado un propietario: " + nombre);
	}

}
