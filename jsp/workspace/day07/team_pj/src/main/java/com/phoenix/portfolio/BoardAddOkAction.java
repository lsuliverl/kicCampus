package com.phoenix.portfolio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phoenix.action.Action;
import com.phoenix.action.ActionForward;
import com.phoenix.portfolio.PortfolioDAO;
import com.phoenix.portfolio.PortfolioDTO;

public class BoardAddOkAction implements Action {
	
	@Override
	public ActionForward execute (HttpServletRequest request, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		PortfolioDAO pdao = new PortfolioDAO();
		PortfolioDTO pdto = new PortfolioDTO();
		
		String pnum = request.getParameter("pnum");
		String ptitle = request.getParameter("ptitle");
		String pcontents = request.getParameter("pcontents");
		String purl = request.getParameter("purl");
		String ppath = request.getParameter("ppath");
		String userid = request.getParameter("userid");
		
		pdto.setPnum(pnum);
		pdto.setPtitle(ptitle);
		pdto.setPcontents(pcontents);
		pdto.setPurl(purl);
		pdto.setPpath(ppath);
		pdto.setUserid(userid);
		
		if(pdao.insertPortfolio(pdto)) {
			// 성공시
			System.out.println("성공시");
			forward.setPath("/portfolio/BoardAdd.bo");
		} else {
			// 실패시
			System.out.println("실패시");
			forward.setPath("/portfolio/BoardAdd.bo");
		}
		forward.setRedirect(true);
					
		return forward;
		
	}
}