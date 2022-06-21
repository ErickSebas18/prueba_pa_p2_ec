package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2EcApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private IPropietarioService propietarioService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Punto 1");
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Chevrolet");
		vehiculo.setPlaca("146523");
		vehiculo.setPrecio(new BigDecimal(45000));
		vehiculo.setTipo("Liviano");
		this.vehiculoService.insertar(vehiculo);
		vehiculo.setPrecio(new BigDecimal(12000));
		vehiculo.setTipo("Pesado");
		this.vehiculoService.actualizar(vehiculo);
		
		System.out.println("Punto 2");
		Propietario propietario = new Propietario();
		propietario.setNombre("Erick");
		propietario.setApellido("Chávez");
		propietario.setFechaNacimiento(LocalDateTime.of(2000, 05, 23, 0, 0));
		propietario.setCedula("431346465");
		this.propietarioService.crearPropietario(propietario);
		
		
	}

}
