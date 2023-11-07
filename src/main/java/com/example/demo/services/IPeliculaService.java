/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Pelicula;

/**
 * 
 */
public interface IPeliculaService {

	/**
	 * Deveuelve todos los peliculas
	 * 
	 * @return List<Pelicula>
	 */
	public List<Pelicula> getAllPelicula();

	/**
	 * Devuelve un pelicula en especifico
	 * 
	 * @param id
	 * @return Pelicula
	 */
	public Pelicula getIdPelicula(int id);

	/**
	 * Añade un pelicula a la base de datos
	 * 
	 * @param pelicula
	 * @return Pelicula
	 */
	public Pelicula addPelicula(Pelicula pelicula);

	/**
	 * Actualiza un pelicula
	 * 
	 * @param pelicula
	 * @return Pelicula
	 */
	public Pelicula updatePelicula(Pelicula pelicula);

	/**
	 * Elimina un pelicula
	 * 
	 * @param id
	 */
	public void deletePelicula(int id);
}
