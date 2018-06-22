package br.univel.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Table(name="tb_login")
@Entity
public class LoginModel {
 
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id_login")
	private Integer codigo;
 
	@Column(name="ds_email")
	private String email;
	
	@Column(name="ds_senha")
	private String senha;
 

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
 
}