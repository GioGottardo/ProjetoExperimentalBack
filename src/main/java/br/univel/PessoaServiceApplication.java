package br.univel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages = "br.com.projeto")
public class PessoaServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(PessoaServiceApplication.class, args);
	}
}
