package com.codingbox.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.board.dao.BoardDAO;

public class DeleteReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		int replynum = Integer.parseInt(request.getParameter("replynum"));
		String boardnum = request.getParameter("boardnum");
		
		if(bdao.deleteReply(replynum)) {
			forward.setRedirect(true);
			forward.setPath("/board/BoardView.bo?boardnum="+boardnum);
		}
		
		return forward;
	}

}














