package com.ap.backendPortfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String titulo;
	private int anioFin;
	private String lugar;
	private String descripcion;
	private int calificacion;
	
	/**
	 * @param id
	 * @param titulo
	 * @param anioFin
	 * @param lugar
	 * @param descripcion
	 * @param calificacion
	 */
	public Educacion(long id, String titulo, int anioFin, String lugar, String descripcion, int calificacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anioFin = anioFin;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.calificacion = calificacion;
	}
	/**
	 * 
	 */
	public Educacion() {
		super();
	}
	
	/* getters & setters */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnioFin() {
		return anioFin;
	}
	public void setAnioFin(int anioFin) {
		this.anioFin = anioFin;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}	

}
