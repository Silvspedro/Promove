package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

/**
 * Servlet implementation class ValidacaoLogin
 */
@WebServlet(urlPatterns = {"/ValidacaoLogin, /Controller", "/main", "/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
    JavaBeans usuario = new JavaBeans();
   
    public Controller() {
    	super();
    }

	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath(); // Armazena o caminho da requisição.
		System.out.println(action);
		if (action.equals("/ValidacaoLogin")) {
			validacaoLogin(request, response);
		} else if (action.equals("/insert")) {
			novoUsuario(request, response);
		}  
	}
	
	
	protected void novoUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Teste de recebimento dos dados do formulário.
		System.out.println(request.getParameter("nome"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("senha"));
		// Setar as variáveis JavaBeans.
		usuario.setNome_usuario(request.getParameter("nome"));
		usuario.setEmail_usuario(request.getParameter("email"));
		usuario.setSenha_usuario(request.getParameter("senha"));
		// Invocar o método inserirUsuario passando o objeto contato.
		dao.inserirUsuario(usuario);
		// Redirecionar para o documento login.html
		response.sendRedirect("confirm-cadastro.html");
	}



	
	protected void validacaoLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Criando um objeto para receber os dados javaBeans
		
		ArrayList<JavaBeans> lista = dao.validacaoLogin();
		for (int i=0; i <lista.size();i++) {
			System.out.println(lista.get(i).getId_usuario());
			System.out.println(lista.get(i).getEmail_usuario());
			System.out.println(lista.get(i).getSenha_usuario());
			
		}
		String email_ = "admin@gmail.com";
	    String senha_ = "admin";
	  
		String email= request.getParameter("email");
		String senha= request.getParameter("senha");
		
		if (email_.equals(email) && senha_.equals(senha)) {
			response.sendRedirect("Login-correto.jsp");
	    } else {
	       response.sendRedirect("Login-errado.jsp");
	    }
		
	}

}
