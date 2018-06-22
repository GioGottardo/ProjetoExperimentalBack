package br.univel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.univel.model.LoginModel;
import br.univel.repository.LoginRepository;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	

	/**
	 * CONSULTAR TODAS AS PESSOAS
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<LoginModel> consultar() {

		return this.loginRepository.findAll();
	}	
}
