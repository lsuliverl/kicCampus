package com.codingbox.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Do2 {
	public String execute (HttpServletRequest request,
			HttpServletResponse response) {
		request.setAttribute("result", "do2요청보내기");
		return "do2.jsp";
	}
	
}
