package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.SingleConnectionBanco;
import model.ModelCafe;

public class DAOLoginRepository {
	
private Connection connection;
	
	public DAOLoginRepository() {
		connection = SingleConnectionBanco.getConnection();
	}
	
	public void salvar(ModelCafe modelo) {
		try {
			
			String sql = "insert into lista_cafe( nome, cpf, comida) values (?,?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			
			insert.setString(1, modelo.getNome());
			insert.setString(2, modelo.getCpf());
			insert.setString(3, modelo.getComida());
			insert.execute();
			connection.commit(); //salva no banco
					
		}catch(Exception e) {
			try {
				connection.rollback(); //reverte a operação
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public boolean validarDados(ModelCafe modelo) throws SQLException {
		
		//Se quiser aceitar caractear maiusculo eu faço um  upper(login) = upper(?) ande upper(senha) = upper(?)
		String sql = "select * from lista_cafe where cpf = ? and comida = ?" ;
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, modelo.getCpf());
		statement.setString(2, modelo.getComida());
		
		ResultSet resultado = statement.executeQuery();
		
		if(resultado.next()) {
			return true; //se for true já existe na lista
		}
		
		return false; // não existe na lista 
	}
	
		
}
	

