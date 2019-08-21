package com.andreymasiero.ilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cursos_api")
public class CursosServlet extends HttpServlet {

	private static final long serialVersionUID = -2762630233921916070L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		PrintWriter out = resp.getWriter();
		out.println("{" + 
				"	\"cursos\": [{" + 
				"			\"nome\": \"Matemática\"," + 
				"			\"decricao\": \"Desde os gregos, você nunca imaginou ter tanta diversão com os números. Descubra como criar arte apenas com equações e dê vida a sua imaginação.\"" + 
				"		}," + 
				"		{" + 
				"			\"nome\": \"Lógica de Programação\"," + 
				"			\"decricao\": \"Assim como o Neo em Matrix, aprenda a ver o mundo através dos modelos binários. Você irá descobrir que pode trazer vida até a objetos inanimados.\"" + 
				"		}, {" + 
				"			\"nome\": \"Português\"," + 
				"			\"decricao\": \"Venha aprender a ser um romântico e impressione a todos com poesias retiradas do fundo do coração. Grandes truques para você atingir o coração de todos da maneira que deseja. \"" + 
				"		}" + 
				"" + 
				"	]" + 
				"}");
		out.close();
	}

}
