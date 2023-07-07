package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;
import com.example.demo.repository.modelo.Futbolista;

public interface FutbolistaRepository {
	public void insertar(Futbolista futbolista);
	public void actualizar(Futbolista futbolista);
	public void borrar(String cedula);
	public Futbolista seleccionar(String cedula);
	//single result, por apellido y precio
	public Futbolista seleccionarPorApellido(String apellido);
	public Futbolista seleccionarPorPrecio(BigDecimal precio);
	//result list
	public List<Futbolista> seleccionarListaPorPrecio(BigDecimal precio);
	
	//result List
	public List<Futbolista> seleccionarPorApellidoTyped(String apellido);
	//single result
	public Futbolista seleccionarPorApellidoyNombreTyped(String apellido, String nombre);
	
	//Criteria API Query
	public Futbolista seleccionarPorPrecioFutbolistaCriteriaAPIQuery(BigDecimal precioFutbolista);

}
