/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Sala;

/**
 * 
 */
public interface ISalaService {

	/**
	 * Deveuelve todos los salas
	 * 
	 * @return List<Sala>
	 */
	public List<Sala> getAllSala();

	/**
	 * Devuelve un sala en especifico
	 * 
	 * @param id
	 * @return Sala
	 */
	public Sala getIdSala(int id);

	/**
	 * Añade un sala a la base de datos
	 * 
	 * @param sala
	 * @return Sala
	 */
	public Sala addSala(Sala sala);

	/**
	 * Actualiza un sala
	 * 
	 * @param sala
	 * @return Articulos
	 */
	public Sala updateSala(Sala sala);

	/**
	 * Elimina un sala
	 * 
	 * @param id
	 */
	public void deleteSala(int id);
}
