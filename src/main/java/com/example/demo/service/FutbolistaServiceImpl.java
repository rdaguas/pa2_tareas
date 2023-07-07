package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.FutbolistaRepository;
import com.example.demo.repository.modelo.Futbolista;

@Service
public class FutbolistaServiceImpl implements FutbolistaService{
	
	@Autowired
	private FutbolistaRepository futbolistaRepository;

	@Override
	public void guardar(Futbolista futbolista) {
		this.futbolistaRepository.insertar(futbolista);
	}

	@Override
	public void actualizar(Futbolista futbolista) {
		this.futbolistaRepository.actualizar(futbolista);
	}

	@Override
	public void borrar(String cedula) {
		this.futbolistaRepository.borrar(cedula);
		
	}

	@Override
	public Futbolista buscar(String cedula) {
		
		return this.futbolistaRepository.seleccionar(cedula);
	}

	@Override
	public Futbolista buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.futbolistaRepository.seleccionarPorApellido(apellido);
	}

	

	

	@Override
	public Futbolista seleccionarPorPrecio(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.futbolistaRepository.seleccionarPorPrecio(precio);
	}

	@Override
	public List<Futbolista> seleccionarListaPorPrecio(BigDecimal precio) {
		return this.futbolistaRepository.seleccionarListaPorPrecio(precio);
	}

	@Override
	public Futbolista buscarPorApellidoyNombreTyped(String apellido, String nombre) {
		
		return this.futbolistaRepository.seleccionarPorApellidoyNombreTyped(apellido, nombre);
	}

	@Override
	public List<Futbolista> buscarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.futbolistaRepository.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public Futbolista buscarPorPrecioFutbolistaCriteriaAPIQuery(BigDecimal precioFutbolista) {
		// TODO Auto-generated method stub
		return this.futbolistaRepository.seleccionarPorPrecioFutbolistaCriteriaAPIQuery(precioFutbolista);
	}

}
