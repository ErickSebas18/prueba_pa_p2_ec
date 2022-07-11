package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Propietario;

public interface IPropietarioRepository {

	public Propietario consultar(String cedula);

	public void crear(Propietario propietario);

	public void eliminar(String cedula);
}
