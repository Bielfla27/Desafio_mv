package servlet;

import java.io.IOException;
import java.sql.SQLException;

import dao.DAOLoginRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelCafe;


public class serveletCafe extends HttpServlet {
	DAOLoginRepository daoLogin = new DAOLoginRepository(); 
	private static final long serialVersionUID = 1L;

    public serveletCafe() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String comida = request.getParameter("comida");
		
	
		try {
			if(nome != null && !nome.isEmpty() && cpf != null && !cpf.isEmpty() && comida != null && !comida.isEmpty()) {
				ModelCafe modelCafe = new ModelCafe();	
				modelCafe.setNome(nome);
				modelCafe.setCpf(cpf);
				modelCafe.setComida(comida);
					if(!daoLogin.validarDados(modelCafe)) {
						daoLogin.salvar(modelCafe);
						RequestDispatcher redirecionar  = request.getRequestDispatcher("lista.jsp");
						redirecionar.forward(request, response);
					}else {
						RequestDispatcher redirecionar  = request.getRequestDispatcher("index.jsp");
						request.setAttribute("msg", "CPF ou Comida já exite na lista");
						redirecionar.forward(request, response);
					}
			}else {
				RequestDispatcher redirecionar  = request.getRequestDispatcher("index.jsp");
				redirecionar.forward(request, response);
			}
			
		} catch (SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
