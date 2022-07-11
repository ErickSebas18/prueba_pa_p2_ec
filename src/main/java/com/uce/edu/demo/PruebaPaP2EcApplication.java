package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Propietario;
import com.uce.edu.demo.repository.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2EcApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private IPropietarioService propietarioService;

	//@Autowired
	//private IMatriculaGestorService matriculaGestorService;

	private static Logger logJava = Logger.getLogger(PruebaPaP2EcApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Chevrolet");
		vehiculo.setPlaca("PIB1324");
		vehiculo.setPrecio(new BigDecimal(20000));
		vehiculo.setTipo("L");
		//this.vehiculoService.insertar(vehiculo);
		logJava.info("Punto 1.- Se ha insertado un vehículo: " + vehiculo);

	
		vehiculo.setPrecio(new BigDecimal(30000));
		vehiculo.setMarca("Ford");
		this.vehiculoService.actualizar(vehiculo);
		logJava.info("Punto 2.- Se ha actualizado el vehículo: " + vehiculo);

		Propietario pro = new Propietario();
		pro.setApellido("Chávez");
		pro.setNombre("Erick");
		pro.setCedula("1561344312");
		pro.setFechaNacimiento(LocalDateTime.now());
		//this.propietarioService.crear(pro);
		logJava.info("Punto 3. - Se ha insertado un vehículo: " + pro);

		/*System.out.println("\nPunto 4");
		this.matriculaGestorService.generar(pro.getCedula(), vehiculo.getPlaca());*/
	}

}
