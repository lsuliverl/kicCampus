package com.codingbox.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class ElTest extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
		arg0.setAttribute("result", "success");
		
		String[] names = {"kjh", "abc"};
		arg0.setAttribute("names", names);
		
		Map<String, Object> hm = new HashMap<>();
		hm.put("id", 1);
		hm.put("title", "el학습");
		arg0.setAttribute("notic", hm);
		
		
		RequestDispatcher dispatcher
			= arg0.getRequestDispatcher("/test.jsp");
		dispatcher.forward(arg0, arg1);
	}
}










