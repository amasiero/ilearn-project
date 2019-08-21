package com.andreymasiero.ilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login", description = "Servlet responsável por realizar a autenticação do usuário no sistema.")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -8521881430490343076L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String user = req.getParameter("user");
		String password = req.getParameter("pwd");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html><body>");
		if ("admin".equals(user) && "123".equals(password))
			writer.println("<h1>Usuário autenticado com sucesso!</h1>");
		else
			writer.println("<h1>Usuário e/ou senha inválidos!</h1>");
		writer.println("<a href=\"index.html\">Voltar</a>");
		writer.println("</body></html>");
		writer.flush();
		writer.close();

	}

}
