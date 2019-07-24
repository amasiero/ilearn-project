package com.andreymasiero.ilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add_newsletter", description = "Servlet para cadastrar e-mail na newsletter.")
public class NewsletterServlet extends HttpServlet {

	private static final long serialVersionUID = 280329729209462055L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html><body>");
		writer.println("<h1>Cadastro realizado com sucesso!</h1>");
		writer.println("<p>E-mail cadastrado:" + email + "</p>");
		writer.println("<a href=\"index.html\">Voltar</a>");
		writer.println("</body></html>");
		writer.close();
	}

}
