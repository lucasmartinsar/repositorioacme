package br.com.modelo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private long id;
	private String descricao;

	private List<Email> emails;
	
	public Email() {
		setEmails (new ArrayList<Email>());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	
	
}

