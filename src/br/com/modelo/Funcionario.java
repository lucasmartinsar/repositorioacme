package br.com.modelo;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private Long id;
	private String nome;
	private String cargo;
	private String matricula;
	private List<Telefone> Telefones = new ArrayList(); 	
	private List<Email> Emails = new ArrayList();
	private List<Departamento> Departamentos = new ArrayList();
	private double salario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public List<Telefone> getTelefones() {
		return Telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		Telefones = telefones;
	}
	public List<Email> getEmails() {
		return Emails;
	}
	public void setEmails(List<Email> emails) {
		Emails = emails;
	}
	public List<Departamento> getDepartamentos() {
		return Departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		Departamentos = departamentos;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	
	
	
		
}	

