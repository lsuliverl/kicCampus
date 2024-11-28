package com.codingbox.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.board.dao.BoardBean;
import com.codingbox.board.dao.BoardDAO;

public class BoardWriteOkAction implements Action {

	// 글 등록
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		BoardBean board = new BoardBean();
		
		String boardtitle = request.getParameter("boardtitle");
		String boardcontents = request.getParameter("boardcontents");
		String username = request.getParameter("username");
		
		board.setBoardtitle(boardtitle);
		board.setBoardcontents(boardcontents);
		board.setUsername(username);
		
		if(bdao.insertBoard(board)) {
			// 성공시
			System.out.println("성공시");
			forward.setPath("/board/BoardWrite.bo");
		} else {
			// 실패시
			System.out.println("실패시");
			forward.setPath("/board/BoardWrite.bo");
		}
		forward.setRedirect(true);
		
		return forward;
	}
}











