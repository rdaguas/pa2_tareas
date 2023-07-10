package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Futbolista;
import com.example.demo.service.FutbolistaService;

@SpringBootApplication
public class Pa2TareasApplication implements CommandLineRunner {

	@Autowired
	private FutbolistaService futbolistaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2TareasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Tarea 8 CRITERIA API QUERY
		Futbolista futb = new Futbolista();
		futb.setNombre("Sergio");
		futb.setApellido("Ramos");
		futb.setPrecioFutbolista(new BigDecimal(6000));

		Futbolista futb2 = new Futbolista();
		futb2.setNombre("Enner");
		futb2.setApellido("Valencia");
		futb2.setPrecioFutbolista(new BigDecimal(3000));

		//this.futbolistaService.guardar(futb);
		// this.futbolistaService.guardar(futb2);

		// this.futbolistaService.guardar(futb);
		// this.futbolistaService.guardar(futb2);
		
		//REPORTE GENERADO DTO
		
		this.futbolistaService.buscarReporteTodos().forEach(System.out::println);
		
		
		
		
		// Llamo por Apellido
//		// Query con Single Result
//		System.out.println("-------------------QUERY SINGLE RESULT - POR APELLIDO -------------------");
//		System.out.println(this.futbolistaService.buscarPorApellido("Messi"));
//		// Llamo por Precio del Jugador
//		// Query con Single result
//		System.out.println("-------------------QUERY SINGLE RESULT - POR PRECIO -------------------");
//		System.out.println(this.futbolistaService.seleccionarPorPrecio(new BigDecimal(1000)));
//		// Busco por precio, con ResultList();
//		System.out.println("------------------- QUERY  RESULT LIST  - POR PRECIO -------------------");
//		List<Futbolista> fut = this.futbolistaService.seleccionarListaPorPrecio(new BigDecimal(2000));
//		System.out.println(fut);
//		//Busco por Apellido y Nombre, con TypedQuery - single result
//		System.out.println("------------------- TYPEDQUERY  SINGLE RESULT  - POR APELLIDO Y NOMBRE -------------------");
//		Futbolista futApellidoyNombre = this.futbolistaService.buscarPorApellidoyNombreTyped("Ramos", "Sergio");
//		System.out.println(futApellidoyNombre);
//		//Busco por Apellido, con TypedQuery - RESULLT LIST
//		System.out.println("------------------- TYPEDQUERY  RESULT LIST - POR APELLIDO -------------------");
//		List<Futbolista> futTy = this.futbolistaService.buscarPorApellidoTyped("Valencia");
//		System.out.println(futTy);
		
//		System.out.println("************************************ CRITERIA API QUERY ************************************");
//		System.out.println("Futbolista por precioFutbolista, CriteriaApiQuery: "+ this.futbolistaService.buscarPorPrecioFutbolistaCriteriaAPIQuery(new BigDecimal(5000)));
//
//		System.out.println(
//				"************************************ DINAMICO CRITERIA API QUERY ************************************");
//		System.out.println("Futbolista por precioFutbolista, DINAMICO CriteriaApiQuery: "
//				+ this.futbolistaService.buscarFutbolistaDinamico("Leo", "Messi", new BigDecimal(7000)));

		//System.out.println("************************************ DELETE CON JPQL ************************************");
		//System.out.println("Se elimino: " + this.futbolistaService.eliminarPorNombre("Sergio"));
		
		
		//System.out.println("************************************ UPDATE CON JPQL ************************************");
		//System.out.println("Se actualizo: " + this.futbolistaService.actualizarPorApellido("Roberto", "Ronaldo"));

	}

}
