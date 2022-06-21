package com.uce.edu.demo.service;

import java.math.BigDecimal;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public Matricula crear(String cedula, String placa);

	public BigDecimal calcularValorMatricula(String tipo, BigDecimal precio);
	
}
