package br.univel.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.univel.model.PessoaModel;


public interface PessoaRepository extends Repository<PessoaModel, Integer> {

	void save(PessoaModel pessoa);

	void delete(PessoaModel pessoa);

	List<PessoaModel> findAll();

	PessoaModel findOne(Integer id);
	
	
	
	
}