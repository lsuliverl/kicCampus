package com.phoenix.portfolio;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phoenix.action.ActionForward;

@WebServlet("*.bo")
public class PortfolioFrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doProcess(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doProcess(req, resp);

	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestURI = request.getRequestURI();
		ActionForward forward = null;
		
		switch(requestURI) {
		case "/portfolio/BoardAdd.bo":
			forward = new ActionForward(true,"/portfolio/add.jsp");
			break;
		case "/portfolio/BoardWriteOK.bo":
			forward = new BoardAddOkAction().execute(request, response);
			break;
		}
		
		
		
		
		if( forward != null ) {
			if( forward.isRedirect() ) {
				// true : redirect
				response.sendRedirect(forward.getPath());
				
			} else {
				// false : forward
				RequestDispatcher disp = request.getRequestDispatcher(forward.getPath());
				disp.forward(request, response);
			}
		}	
	}
}