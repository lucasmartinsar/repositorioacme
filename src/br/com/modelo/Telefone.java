package br.com.modelo;

import java.util.ArrayList;
import java.util.List;

public class Telefone {

	private Long id;
	private String ddd;
	private String numero;
	
	private List<Telefone> telefones;
	public Telefone() {
		setTelefones (new ArrayList<Telefone>());
	}
	
	public List<Telefone> getTelefones(){
		return telefones;
	}
	
	public void setTelefones (List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}

