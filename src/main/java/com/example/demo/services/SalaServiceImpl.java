/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDAO;
import com.example.demo.dto.Sala;

/**
 * 
 */
@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	ISalaDAO daoArticulo;

	/**
	 * Deveuelve todos los articulos
	 * 
	 * @return List<Sala>
	 */
	public List<Sala> getAllArticulo() {
		return daoArticulo.findAll();
	}

	/**
	 * Devuelve un articulo en especifico
	 * 
	 * @param id
	 * @return Sala
	 */
	public Sala getIdArticulo(int id) {
		return daoArticulo.findById(id).get();
	}

	/**
	 * Añade un articulo a la base de datos
	 * 
	 * @param sala
	 * @return Sala
	 */
	public Sala addArticulo(Sala sala) {
		return daoArticulo.save(sala);
	}

	/**
	 * Actualiza un articulo
	 * 
	 * @param sala
	 * @return Articulos
	 */
	public Sala updateArticulo(Sala sala) {
		return daoArticulo.save(sala);
	}

	/**
	 * Elimina un articulo
	 * 
	 * @param id
	 */
	public void deleteArticulo(int id) {
		daoArticulo.deleteById(id);
	}
}
