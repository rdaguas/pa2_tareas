package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "futbolista")
@Entity
@NamedQueries({
		@NamedQuery(name = "Futbolista.buscaPorNombre", query = "Select f from Futbolista f WHERE f.nombre =: datoNombre"),
		@NamedQuery(name = "Futbolista.buscaPorApellido", query = "Select f from Futbolista f WHERE f.apellido =: datoApellido") })
@NamedNativeQueries({
		@NamedNativeQuery(name = "Futbolista.buscarApellidoNative", query = "Select * from futbolista where futb_apellido =:datoApellido", resultClass = Futbolista.class),
		@NamedNativeQuery(name = "Futbolista.buscarNombreNative", query = "Select * from futbolista where futb_nombre =:datoNombre", resultClass = Futbolista.class) })
public class Futbolista {

	@GeneratedValue(generator = "seq_futbolista", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_futbolista", sequenceName = "seq_futbolista", allocationSize = 1)
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
