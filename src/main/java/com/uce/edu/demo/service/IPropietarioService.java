package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Propietario;

public interface IPropietarioService {

	public void crear(Propietario propietario);

	public void eliminar(String cedula);
}
