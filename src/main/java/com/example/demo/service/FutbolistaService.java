package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Futbolista;
import com.example.demo.repository.modelo.dto.FutbolistaDTO;

public interface FutbolistaService {
	
	public void guardar(Futbolista futbolista);
	public void actualizar(Futbolista futbolista);
	public void borrar(String cedula);
	public Futbolista buscar(String cedula);
	
	public Futbolista buscarPorApellido(String apellido);
	public Futbolista seleccionarPorPrecio(BigDecimal precio);
	public List<Futbolista> seleccionarListaPorPrecio(BigDecimal precio);
	
	public Futbolista buscarPorApellidoyNombreTyped(String apellido, String nombre);	
	//result List
	public List<Futbolista> buscarPorApellidoTyped(String apellido);	
	
	public Futbolista buscarPorPrecioFutbolistaCriteriaAPIQuery(BigDecimal precioFutbolista);
	
	public Futbolista buscarFutbolistaDinamico(String nombre, String apellido, BigDecimal precioFutbolista);
	
	public int eliminarPorNombre(String nombre);
	public int actualizarPorApellido(String nombre, String apellido);
	
	public List<FutbolistaDTO> buscarReporteTodos();

}
