package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "futbolista")
@Entity
public class Futbolista {
	
	@GeneratedValue(generator = "seq_futbolista",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_futbolista",sequenceName = "seq_futbolista", allocationSize = 1)	
	@Column(name = "futb_id")
	@Id
	private Integer id;
	
	@Column(name = "futb_nombre")
	private String nombre;
	
	@Column(name = "futb_apellido")
	private String apellido;

	@Column(name = "futb_precioFutbolista")
	private BigDecimal precioFutbolista;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public BigDecimal getPrecioFutbolista() {
		return precioFutbolista;
	}

	public void setPrecioFutbolista(BigDecimal precioFutbolista) {
		this.precioFutbolista = precioFutbolista;
	}

	@Override
	public String toString() {
		return "Futbolista [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", precioFutbolista="
				+ precioFutbolista + "]";
	}
	
	
	
	

}
