package com.example.demo.repository.modelo.dto;

import java.math.BigDecimal;

public class FutbolistaDTO {
	
	private String nombre;
	private BigDecimal precioFutbolista;
	
	public FutbolistaDTO() {
		
	}

	public FutbolistaDTO(String nombre, BigDecimal precioFutbolista) {
		super();
		this.nombre = nombre;
		this.precioFutbolista = precioFutbolista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioFutbolista() {
		return precioFutbolista;
	}

	public void setPrecioFutbolista(BigDecimal precioFutbolista) {
		this.precioFutbolista = precioFutbolista;
	}

	@Override
	public String toString() {
		return "FutbolistaDTO [nombre=" + nombre + ", precioFutbolista=" + precioFutbolista + "]";
	}
	
	

	
	
	
	

}
