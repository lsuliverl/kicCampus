package com.codingbox.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.board.dao.BoardDAO;

public class BoardViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		int boardnum = Integer.parseInt(request.getParameter("boardnum"));
		
		bdao.updateReadCount(boardnum);
		
		// 댓글 조회
		request.setAttribute("replylist", bdao.getReplys(boardnum));
		request.setAttribute("board", bdao.getDetail(boardnum));
		forward.setPath("/board/boardview.jsp");
		forward.setRedirect(false);
		
		return forward;
	}
	
	
	
	
	
}








