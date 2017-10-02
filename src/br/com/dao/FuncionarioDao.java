package br.com.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import br.com.conexao.ConnectionFactory;
import br.com.modelo.Funcionario;

public class FuncionarioDao {
	// a conexao com o banco de dadoss
	private Connection conexao;
	public FuncionarioDao() {
		new ConnectionFactory();
		this.conexao = ConnectionFactory.getConnection();
	}
	
	public void adiciona (Funcionario funcionario) throws SQLException {
		String sql = "INSERT INTO funcionario" + "(nome, telefone, email, departamento, matricula, salario) VALUES (?,?,?,?,?,?)";
		
			//PREPARED STATEMENT PARA INSERÇAO
			java.sql.PreparedStatement stmt = this.conexao.prepareStatement(sql);
			//setar os valores
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getMatricula());
			stmt.setString(3, funcionario.getCargo());
			
			stmt.executeQuery();
			this.conexao.close();
	}
	}

	

