package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2EcApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private IMatriculaGestorService matriculaGestorService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("\nPunto 1");
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Chevrolet");
		vehiculo.setPlaca("PIB1324");
		vehiculo.setPrecio(new BigDecimal(20000));
		vehiculo.setTipo("L");
		this.vehiculoService.insertar(vehiculo);
		
		System.out.println("\nPunto 2");
		vehiculo.setPrecio(new BigDecimal(30000));
		vehiculo.setMarca("Ford");
		this.vehiculoService.actualizar(vehiculo);
		
		System.out.println("\nPunto 3");
		Propietario pro = new Propietario();
		pro.setApellido("Chávez");
		pro.setNombre("Erick");
		pro.setCedula("1561344312");
		pro.setFechaNacimiento(LocalDateTime.now());
		this.propietarioService.crear(pro);
		
		System.out.println("\nPunto 4");
		this.matriculaGestorService.generar(pro.getCedula(), vehiculo.getPlaca());
	}

}
