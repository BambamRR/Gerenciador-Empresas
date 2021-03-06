package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class novaEmpresaServlet
 */
@WebServlet(name = "NovaEmpresaServlet", urlPatterns = { "/novaEmpresa" })
public class novaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa: ");
		
		String novaEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(novaEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		 RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
	        request.setAttribute("empresa", empresa.getNome());
	        rd.forward(request, response);
	}

}
