package com.codingbox.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Do3 {
	public String execute (HttpServletRequest request,
			HttpServletResponse response) {
		request.setAttribute("result", "do3요청보내기");
		return "do3.jsp";
	}
}
