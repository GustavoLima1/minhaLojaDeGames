package com.gustavo.minhaLojaDeGames.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.minhaLojaDeGames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	List <Produto> findAllByNomeContainingIgnoreCase(String nome);

}
