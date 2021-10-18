package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelCafe;


public class serveletCafe extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public serveletCafe() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String comida = request.getParameter("comida");
		
		
		
		
		if(nome != null && !nome.isEmpty() && cpf != null && !cpf.isEmpty() && comida != null && !comida.isEmpty()) {
			ModelCafe modelCafe = new ModelCafe();	
			modelCafe.setNome(nome);
			modelCafe.setNome(cpf);
			modelCafe.setNome(comida);
			RequestDispatcher redirecionar  = request.getRequestDispatcher("lista.jsp");
			redirecionar.forward(request, response);
		}else {
			RequestDispatcher redirecionar  = request.getRequestDispatcher("index.jsp");
			redirecionar.forward(request, response);
		}
		
		
	}

}
