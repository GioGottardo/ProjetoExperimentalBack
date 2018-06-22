package br.univel.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Table(name="tb_produto")
@Entity
public class ProdutoModel {
 
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id_produto")
	private Integer codigo;
 
	@Column(name="ds_nomeproduto")
	private String  nomeproduto;
 
	@Column(name="fl_ativo")
	private boolean ativo;
	
	@Column(name="ds_valor")
	private Integer valor;
	
	@Column(name="ds_quantidade")
	private Integer quantidade;
	

	public String getNomeproduto() {
		return nomeproduto;
	}
	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nomeproduto;
	}
	public void setNome(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
 
}