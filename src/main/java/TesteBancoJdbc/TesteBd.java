package TesteBancoJdbc;

import java.sql.Connection;

import org.junit.Test;

import dao.DAOLoginRepository;
import model.ModelCafe;

public class TesteBd {
	
	private Connection connection; 
	
	@Test
	public void initBanco() {
		
		DAOLoginRepository daoLogin = new DAOLoginRepository(); 
		ModelCafe modelo = new ModelCafe(); 
		
		modelo.setNome("Gabriel");
		modelo.setCpf("102.504.725.12");
		modelo.setComida("Pão de mel");
		
		daoLogin.salvar(modelo);

	}
	

}
