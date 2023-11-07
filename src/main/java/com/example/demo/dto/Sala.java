/**
 * 
 */
package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "articulos")
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo")
	private int codigo;

	@Column(name = "Nombre")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "Pelicula")
	private Pelicula pelicula;

	/**
	 * 
	 */
	public Sala() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param pelicula
	 */
	public Sala(int codigo, String nombre, Pelicula pelicula) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Sala [codigo=" + codigo + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}

}
