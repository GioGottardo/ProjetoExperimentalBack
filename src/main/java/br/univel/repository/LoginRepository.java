package br.univel.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.univel.model.LoginModel;


public interface LoginRepository extends Repository<LoginModel, Integer> {

	List<LoginModel> findAll();
	
	
	
}