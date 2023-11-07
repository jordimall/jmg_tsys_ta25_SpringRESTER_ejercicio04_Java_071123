/**
 * 
 */
package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo")
	private int codigo;

	@Column(name = "Nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "Codigo")
	private List<Sala> sala;

	@Column(name = "Calificacion_Edad")
	private int calificacionEdad;

	/**
	 * 
	 */
	public Pelicula() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param calificacionEdad
	 */
	public Pelicula(int codigo, String nombre, int calificacionEdad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
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
	 * @return the sala
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	/**
	 * @return the calificacionEdad
	 */
	public int getCalificacionEdad() {
		return calificacionEdad;
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
	 * @param sala the sala to set
	 */
	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	/**
	 * @param calificacionEdad the calificacionEdad to set
	 */
	public void setCalificacionEdad(int calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", sala=" + sala + ", calificacionEdad="
				+ calificacionEdad + "]";
	}

}
