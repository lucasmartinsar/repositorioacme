package br.com.modelo;

import java.sql.SQLException;

import br.com.dao.FuncionarioDao;

public class FuncionarioService {
		
	private FuncionarioDao funcionarioDAO;
	
	
	public FuncionarioService () {
		this.funcionarioDAO = new FuncionarioDao ();
	}
	
	public void salvarNoService (Funcionario f) throws SQLException {
		this.funcionarioDAO.adiciona(f);
	}
}
