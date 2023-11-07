/**
 * 
 */
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pelicula;
import com.example.demo.services.PeliculaServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;

	/**
	 * Deveuelve todos los peliculas
	 * 
	 * @return List<Pelicula>
	 */
	@GetMapping("/peliculas")
	public List<Pelicula> allPelicula() {
		return peliculaServiceImpl.getAllPelicula();
	}

	/**
	 * Devuelve un pelicula en especifico
	 * 
	 * @param id
	 * @return Pelicula
	 */
	@GetMapping("/peliculas/{id}")
	public Pelicula showPelicula(@PathVariable(name = "id") int id) {

		Pelicula pelicula_xid = new Pelicula();

		pelicula_xid = peliculaServiceImpl.getIdPelicula(id);

		return pelicula_xid;
	}

	/**
	 * Añade un pelicula a la base de datos
	 * 
	 * @param pelicula
	 * @return Pelicula
	 */
	@PostMapping("/peliculas")
	public Pelicula newPelicula(@RequestBody Pelicula pelicula) {

		return peliculaServiceImpl.addPelicula(pelicula);
	}

	/**
	 * Actualiza un pelicula
	 * 
	 * @param pelicula
	 * @return Pelicula
	 */
	@PutMapping("/peliculas/{id}")
	public Pelicula editPelicula(@PathVariable(name = "id") int id, @RequestBody Pelicula pelicula) {

		Pelicula pelicula_seleccionado = new Pelicula();
		Pelicula pelicula_actualizado = new Pelicula();

		pelicula_seleccionado = peliculaServiceImpl.getIdPelicula(id);

		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacionEdad(pelicula.getCalificacionEdad());

		pelicula_actualizado = peliculaServiceImpl.updatePelicula(pelicula_seleccionado);

		return pelicula_actualizado;
	}

	/**
	 * Elimina un pelicula
	 * 
	 * @param id
	 */
	@DeleteMapping("/peliculas/{id}")
	public void eleiminarPelicula(@PathVariable(name = "id") int id) {
		peliculaServiceImpl.deletePelicula(id);
	}

}
