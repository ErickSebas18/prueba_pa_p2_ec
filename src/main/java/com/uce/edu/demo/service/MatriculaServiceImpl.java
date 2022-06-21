package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;

public class MatriculaServiceImpl implements IMatriculaService {

	@Override
	public Matricula crear(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setCedula(cedula);
		
		Vehiculo v = new Vehiculo();
		v.setPlaca(placa);
		
		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setPropietario(p);
		
		return matricula;
	}

	@Override
	public BigDecimal calcularValorMatricula(String tipo, BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = null;
		if (tipo.equals("L")) {
			valorMatricula = precio.multiply(new BigDecimal(0.15));
		} else if (tipo.equals("P")) {
			valorMatricula = precio.multiply(new BigDecimal(0.10));
		}
		return valorMatricula;
	}

}
