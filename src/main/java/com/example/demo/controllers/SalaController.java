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

import com.example.demo.dto.Sala;
import com.example.demo.services.SalaServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;

	/**
	 * Deveuelve todos los salas
	 * 
	 * @return List<Sala>
	 */
	@GetMapping("/salas")
	public List<Sala> allArticulo() {
		return salaServiceImpl.getAllSala();
	}

	/**
	 * Devuelve un sala en especifico
	 * 
	 * @param id
	 * @return Sala
	 */
	@GetMapping("/salas/{id}")
	public Sala showArticulo(@PathVariable(name = "id") int id) {

		Sala articulo_xid = new Sala();

		articulo_xid = salaServiceImpl.getIdSala(id);

		return articulo_xid;
	}

	/**
	 * Añade un sala a la base de datos
	 * 
	 * @param sala
	 * @return Sala
	 */
	@PostMapping("/salas")
	public Sala newArticulo(@RequestBody Sala sala) {

		return salaServiceImpl.addSala(sala);

	}

	/**
	 * Actualiza un sala
	 * 
	 * @param sala
	 * @return Articulos
	 */
	@PutMapping("/salas/{id}")
	public Sala editArticulo(@PathVariable(name = "id") int id, @RequestBody Sala sala) {

		Sala sala_seleccionado = new Sala();
		Sala sala_actualizado = new Sala();

		sala_seleccionado = salaServiceImpl.getIdSala(id);

		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());

		sala_actualizado = salaServiceImpl.updateSala(sala_seleccionado);

		return sala_actualizado;
	}

	/**
	 * Elimina un articulo
	 * 
	 * @param id
	 */
	@DeleteMapping("/salas/{id}")
	public void eleiminarArticulo(@PathVariable(name = "id") int id) {
		salaServiceImpl.deleteSala(id);
	}
}
