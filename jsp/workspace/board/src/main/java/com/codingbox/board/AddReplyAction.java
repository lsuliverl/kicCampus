package com.codingbox.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.board.dao.BoardDAO;
import com.codingbox.board.dao.ReplyBean;

public class AddReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		ReplyBean reply = new ReplyBean();
		BoardDAO bdao = new BoardDAO();
		
		int boardnum 
			= Integer.parseInt(request.getParameter("boardnum"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String replycontents = request.getParameter("replycontents");
		
		reply.setBoardnum(boardnum);
		reply.setUsername(username);
		reply.setPassword(password);
		reply.setReplycontents(replycontents);
		
		if(bdao.addReply(reply)) {
			// 등록 성공
			forward.setRedirect(true);
			forward.setPath("/board/BoardView.bo?boardnum="+boardnum);
		} else {
			// 등록 실패
			try {
				forward.setRedirect(false);
				PrintWriter out;
				out = resp.getWriter();
				out.println("<script>alert('오류가 발생');history.back();</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return forward;
	}

}











