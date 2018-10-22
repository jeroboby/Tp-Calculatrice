package com.occalcul.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.occalcul.beans.Operation;


@WebServlet("/Calculette")
public class Calculette extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calcul.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Operation operation = new Operation(
	            request.getParameter("operande1"),
	            request.getParameter("operateur"),
	            request.getParameter("operande2"));
	           
		try {
	    request.setAttribute("operation", operation);
		} catch (NumberFormatException e) {
			System.out.println("Ce n'est pas un nombre !");
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/calcul.jsp").include(request, response);
	    
	}

}
