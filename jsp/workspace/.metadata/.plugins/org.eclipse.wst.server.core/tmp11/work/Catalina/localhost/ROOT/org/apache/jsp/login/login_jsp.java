/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-11 08:43:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("<style>\r\n");
      out.write("form { width: 40%; }\r\n");
      out.write("\r\n");
      out.write("/*로그인은 따로 화면 나눔*/\r\n");
      out.write("div {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("div.left {	\r\n");
      out.write("	width: 20%;\r\n");
      out.write("	float: left;\r\n");
      out.write("}\r\n");
      out.write("div.right {\r\n");
      out.write("	width: 80%;\r\n");
      out.write("	float: right;\r\n");
      out.write("	height: 670px;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.idArea{\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("div.pwArea{\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text], input[type=password] {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding: 12px 20px;\r\n");
      out.write("  margin: 8px 0;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("  background-color: #434343;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 14px 20px;\r\n");
      out.write("  margin: 8px 0;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("  opacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.join:hover{\r\n");
      out.write("	text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cancelbtn {\r\n");
      out.write("  width: auto;\r\n");
      out.write("  padding: 10px 18px;\r\n");
      out.write("  background-color: #f44336;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".imgcontainer {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  margin: 24px 0 12px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img.avatar {\r\n");
      out.write("  width: 40%;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("  padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span.psw {\r\n");
      out.write("  float: right;\r\n");
      out.write("  padding-top: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\r\n");
      out.write("@media screen and (max-width: 300px) {\r\n");
      out.write("  span.psw {\r\n");
      out.write("     display: block;\r\n");
      out.write("     float: none;\r\n");
      out.write("  }\r\n");
      out.write("  .cancelbtn {\r\n");
      out.write("     width: 100%;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\r\n");
      out.write("	<div class = \"left\">\r\n");
      out.write("		<header ></header>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class = \"right\">\r\n");
      out.write("	\r\n");
      out.write("		<form action=\"/login/logincheck.jsp\" method=\"post\" id=\"frm\" class=\"frm\" name=\"frm\" >\r\n");
      out.write("		   	<div class=\"idArea\">\r\n");
      out.write("			   	<label for=\"userid\" ><b>아이디</b></label>\r\n");
      out.write("			    <input  type=\"text\" placeholder=\"아이디를 입력해주세요\" name=\"userid\"  id=\"userid\" class=\"userid\" required>\r\n");
      out.write("		   	</div>\r\n");
      out.write("		\r\n");
      out.write("		    <div class=\"pwArea\">\r\n");
      out.write("			    <label for=\"userpw\"><b>비밀번호</b></label>\r\n");
      out.write("			    <input type=\"password\" placeholder=\"비밀번호를 입력해주세요\" name=\"userpw\"  id=\"userpw\" class=\"userpw\" required>\r\n");
      out.write("		    </div>\r\n");
      out.write("		        \r\n");
      out.write("		    <button type=\"submit\" id=\"loginbtn\" class=\"loginbtn\" name=\"loginbtn\" >로그인</button>\r\n");
      out.write("		    \r\n");
      out.write("		    <div align=\"right\">\r\n");
      out.write("		    	<a href=\"/join/join.jsp\" class = \"join\" style=\"color: #434343 ; font-size: 18px; margin-right: 3px;\" >회원가입</a>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    \r\n");
      out.write("	\r\n");
      out.write("		</form>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"/header.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}