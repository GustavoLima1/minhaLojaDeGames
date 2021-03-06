package com.gustavo.minhaLojaDeGames.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.minhaLojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	List<Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);

}
