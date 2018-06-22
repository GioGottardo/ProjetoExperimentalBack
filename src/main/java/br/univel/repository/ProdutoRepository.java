package br.univel.repository;

import java.util.List;

import org.springframework.data.repository.Repository;


import br.univel.model.ProdutoModel;


public interface ProdutoRepository extends Repository<ProdutoModel, Integer> {

	void save(ProdutoModel produto);

	void delete(ProdutoModel produto);

	List<ProdutoModel> findAll();

	ProdutoModel findOne(Integer id);
	
	
	
	
}