package com.codingbox.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.ActionForward;

@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req
			, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException  {
		String requestURI = request.getRequestURI();
		ActionForward forward = null;
		
		switch (requestURI) {
		case "/board/BoardWrite.bo":
			forward = new ActionForward(true,"/board/boardwrite.jsp");
			break;
		case "/board/BoardWriteOK.bo":
			forward = new BoardWriteOkAction().execute(request, response);
			break;
		case "/board/BoardList.bo":
			forward = new BoardListAction().execute(request, response);
			break;
		case "/board/BoardView.bo":
			forward = new BoardViewAction().execute(request, response);
			break;
		case "/board/AddReply.bo":
			forward = new AddReplyAction().execute(request, response);
			break;
		case "/board/UpdateReply.bo":
			forward = new UpdateReplyAction().execute(request, response);
			break;
		case "/board/DeleteReply.bo":
			forward = new DeleteReplyAction().execute(request, response);
			break;
			
		}
		
		
		
		
		// 전송에 대한 일괄처리
		if( forward != null ) {
			if( forward.isRedirect() ) {	
				// true : redirect
				response.sendRedirect(forward.getPath());
			} else {
				// false : forward
				RequestDispatcher disp 
					= request.getRequestDispatcher(forward.getPath());
				disp.forward(request, response);
			}
		}
		
	}
	
	
}











