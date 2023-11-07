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
	ISalaDAO daoSala;

	/**
	 * Deveuelve todos los salas
	 * 
	 * @return List<Sala>
	 */
	public List<Sala> getAllSala() {
		return daoSala.findAll();
	}

	/**
	 * Devuelve un sala en especifico
	 * 
	 * @param id
	 * @return Sala
	 */
	public Sala getIdSala(int id) {
		return daoSala.findById(id).get();
	}

	/**
	 * Añade un sala a la base de datos
	 * 
	 * @param sala
	 * @return Sala
	 */
	public Sala addSala(Sala sala) {
		return daoSala.save(sala);
	}

	/**
	 * Actualiza un sala
	 * 
	 * @param sala
	 * @return Sala
	 */
	public Sala updateSala(Sala sala) {
		return daoSala.save(sala);
	}

	/**
	 * Elimina un sala
	 * 
	 * @param id
	 */
	public void deleteSala(int id) {
		daoSala.deleteById(id);
	}
}
