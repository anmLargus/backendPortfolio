package com.ap.backendPortfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Lob;

@Entity
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int anioInicio;
	private int anioFin;
	private String empresa;
	private String posicion;
	//@Lob
	@Column(columnDefinition="LONGTEXT")
	private String descripcion;
	private Boolean esActual;
	/**
	 * @param id
	 * @param anioInicio
	 * @param anioFin
	 * @param empresa
	 * @param posicion
	 * @param descripcion
	 * @param esActual
	 */
	public Job(long id, int anioInicio, int anioFin, String empresa, String posicion, String descripcion,
			Boolean esActual) {
		super();
		this.id = id;
		this.anioInicio = anioInicio;
		this.anioFin = anioFin;
		this.empresa = empresa;
		this.posicion = posicion;
		this.descripcion = descripcion;
		this.esActual = esActual;
	}
	/**
	 * 
	 */
	public Job() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAnioInicio() {
		return anioInicio;
	}
	public void setAnioInicio(int anioInicio) {
		this.anioInicio = anioInicio;
	}
	public int getAnioFin() {
		return anioFin;
	}
	public void setAnioFin(int anioFin) {
		this.anioFin = anioFin;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getEsActual() {
		return esActual;
	}
	public void setEsActual(Boolean esActual) {
		this.esActual = esActual;
	}
	
}