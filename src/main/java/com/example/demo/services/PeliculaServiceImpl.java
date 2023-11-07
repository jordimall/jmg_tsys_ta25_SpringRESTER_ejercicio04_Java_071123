/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

/**
 * 
 */
@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	IPeliculaDAO daoPelicula;

	/**
	 * Deveuelve todos los peliculas
	 * 
	 * @return List<Pelicula>
	 */
	public List<Pelicula> getAllPelicula() {
		return daoPelicula.findAll();
	}

	/**
	 * Devuelve un pelicula en especifico
	 * 
	 * @param id
	 * @return Pelicula
	 */
	public Pelicula getIdPelicula(int id) {
		return daoPelicula.findById(id).get();
	};

	/**
	 * Añade un pelicula a la base de datos
	 * 
	 * @param pelicula
	 * @return Pelicula
	 */
	public Pelicula addPelicula(Pelicula pelicula) {
		return daoPelicula.save(pelicula);
	}

	/**
	 * Actualiza un pelicula
	 * 
	 * @param pelicula
	 * @return Pelicula
	 */
	public Pelicula updatePelicula(Pelicula pelicula) {
		return daoPelicula.save(pelicula);
	};

	/**
	 * Elimina un pelicula
	 * 
	 * @param id
	 */
	public void deletePelicula(int id) {
		daoPelicula.deleteById(id);
	}

}
