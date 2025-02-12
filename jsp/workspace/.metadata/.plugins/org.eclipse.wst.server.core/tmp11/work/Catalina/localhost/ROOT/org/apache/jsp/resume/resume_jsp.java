/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-11 07:50:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resume;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.phoenix.user.dao.UserDTO;
import com.phoenix.resumes.ResumesDTO;

public final class resume_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.phoenix.resumes.ResumesDTO");
    _jspx_imports_classes.add("com.phoenix.user.dao.UserDTO");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Resumes</title>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("	table{\r\n");
      out.write("		margin:0 auto;\r\n");
      out.write("		width: 80%;\r\n");
      out.write("	}\r\n");
      out.write("	div.all {\r\n");
      out.write("		width: 100%;\r\n");
      out.write("	}\r\n");
      out.write("	div.left {	\r\n");
      out.write("		width: 20%;\r\n");
      out.write("		float: left;\r\n");
      out.write("	}\r\n");
      out.write("	div.right {\r\n");
      out.write("		width: 80%;\r\n");
      out.write("		float: right;\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("	div.i18{\r\n");
      out.write("		display: flex;\r\n");
      out.write("		justify-content: center;\r\n");
      out.write("		align-items: center;\r\n");
      out.write("		padding: 100px;\r\n");
      out.write("		}\r\n");
      out.write("	div.cont{\r\n");
      out.write("		display: inline;\r\n");
      out.write("	}\r\n");
      out.write("	div.innercont{\r\n");
      out.write("		display: inline-block;\r\n");
      out.write("		margin: 10px;\r\n");
      out.write("		width: 100%;\r\n");
      out.write("		margin: 18px;\r\n");
      out.write("	}\r\n");
      out.write("	div.careerArea{\r\n");
      out.write("		display: inline-block; width: 80%\r\n");
      out.write("	}\r\n");
      out.write("	label{\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("		width: 90px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input[type=radio]{\r\n");
      out.write("		accent-color: #434343;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#title{\r\n");
      out.write("		height: 50px;\r\n");
      out.write("	}\r\n");
      out.write("	#board{\r\n");
      out.write("		width:	98%;\r\n");
      out.write("		height:	300px;\r\n");
      out.write("		resize: none;\r\n");
      out.write("	}\r\n");
      out.write("	#url-input{\r\n");
      out.write("		height: 50px;\r\n");
      out.write("	}\r\n");
      out.write("	/* 파일 */\r\n");
      out.write("	.filebox .upload-name {\r\n");
      out.write("	    display: inline-block;\r\n");
      out.write("	    height: 40px;\r\n");
      out.write("	    padding: 0 10px;\r\n");
      out.write("	    vertical-align: middle;\r\n");
      out.write("	    border: 1px solid #dddddd;\r\n");
      out.write("	    width: 90%;\r\n");
      out.write("	    color: #999999;\r\n");
      out.write("	}\r\n");
      out.write("	.filebox label {\r\n");
      out.write("		margin-top: 10px;\r\n");
      out.write("		display:inline-block;\r\n");
      out.write("		width: 60px;\r\n");
      out.write("		background-color: #434343;\r\n");
      out.write("		color: white;\r\n");
      out.write("		padding: 5px 5px;\r\n");
      out.write("		border: none;\r\n");
      out.write("		cursor: pointer;\r\n");
      out.write("		margin-left: 10px;\r\n");
      out.write("		margin-right: 10px;\r\n");
      out.write("		margin: 8px auto;\r\n");
      out.write("	}\r\n");
      out.write("	.filebox input[type=\"file\"] {\r\n");
      out.write("	    position: absolute;\r\n");
      out.write("	    width: 0;\r\n");
      out.write("	    height: 0;\r\n");
      out.write("	    padding: 0;\r\n");
      out.write("	    overflow: hidden;\r\n");
      out.write("	    border: 0;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/* 저장 버튼 */\r\n");
      out.write("	input[type=button],input[type=submit],input[type=reset] ,button{\r\n");
      out.write("	display:inline-block;\r\n");
      out.write("	width: 70px;\r\n");
      out.write("	background-color: #434343;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 5px 5px;\r\n");
      out.write("	margin: 8px 0;\r\n");
      out.write("	border: none;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("	button.del{\r\n");
      out.write("		width: 35px;\r\n");
      out.write("		background-color: #00ff0000;\r\n");
      out.write("		border-color: #00ff0000;\r\n");
      out.write("		font-size: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/* 텍스트 */\r\n");
      out.write("	input[type=text] ,textarea {\r\n");
      out.write("		background-color:#00ff0000;\r\n");
      out.write("		width: 30%;\r\n");
      out.write("		border: none;\r\n");
      out.write("		font-size: 15px;\r\n");
      out.write("		outline:none;\r\n");
      out.write("		border-bottom: solid thin;\r\n");
      out.write("	}\r\n");
      out.write("	hr{\r\n");
      out.write("		margin-top: 30px;\r\n");
      out.write("		margin-bottom: 30px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"all\">\r\n");
      out.write("		<div class = \"left\">\r\n");
      out.write("			<header ></header>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class = \"right\" >\r\n");
      out.write("			<div class = \"i18\">\r\n");
      out.write("				<form name=\"join_form\" id=\"join_form\" style=\"width: 70%;\" action=\"/resume/resume.rs\" >\r\n");
      out.write("				<fieldset>\r\n");
      out.write("					<legend  style=\"font-size: 20px;\" >이력서</legend>\r\n");
      out.write("					<div class = \"cont\">\r\n");
      out.write("						<div class=\"innercont\" style=\"margin-bottom: 25px !important;\">\r\n");
      out.write("							<label >이름</label>\r\n");
      out.write("							<input type=\"text\" name=\"username\" id=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Resumes.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"innercont\" style=\"display: flex !important; margin: 0px !important; margin-left: 18px !important; \">\r\n");
      out.write("							<label style=\"align-self: center;\">성별 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Resumes.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("							\r\n");
      out.write("							<p >\r\n");
      out.write("						        남 : <input type=\"radio\" \r\n");
      out.write("						                    name=\"gender\" value=\"male\"  class=\"male\" />\r\n");
      out.write("						        여 : <input type=\"radio\" \r\n");
      out.write("						                    name=\"gender\" value=\"female\" class=\"female\" >\r\n");
      out.write("						    </p>\r\n");
      out.write("							\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"innercont\" >\r\n");
      out.write("							<label >연락처</label>\r\n");
      out.write("							<input type=\"text\" name=\"userphone\" id=\"userphone\" class=\"userphone\" disabled>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"innercont\">\r\n");
      out.write("							<label>이메일</label>\r\n");
      out.write("							<input type=\"text\" name=\"useremail\" id=\"useremail\" class=\"useremail\" disabled>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("					<hr>\r\n");
      out.write("					<div class = \"cont\">\r\n");
      out.write("						<div class=\"innercont\">\r\n");
      out.write("							<label>최종학력</label>\r\n");
      out.write("							<input type=\"text\" name=\"hight\" id=\"hight\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Resumes.hight }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"innercont\">\r\n");
      out.write("							<label>학교명</label>\r\n");
      out.write("							<input type=\"text\" name=\"school\" id=\"school\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Resumes.school }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"innercont\">\r\n");
      out.write("							<label>전공</label>\r\n");
      out.write("							<input type=\"text\" name=\"major\" id=\"major\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Resumes.major }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"innercont\">\r\n");
      out.write("							<label>재학기간</label>\r\n");
      out.write("							<input type=\"text\" name=\"term\" id=\"term\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Resumes.term }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<hr>\r\n");
      out.write("					\r\n");
      out.write("					<div class = \"cont\">\r\n");
      out.write("						<div class=\"innercont\">\r\n");
      out.write("							<label>경력 및 자격증</label>\r\n");
      out.write("							<textarea style=\"width: 70%;\" name=\"career\" id=\"career\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Resumes.career }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"innercont\">\r\n");
      out.write("							<label>기타사항</label>\r\n");
      out.write("							<textarea style=\"width: 70%;\" name=\"etc\" id=\"etc\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Resumes.etc }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("					<hr>\r\n");
      out.write("					<div class=\"input_group\" align=\"right\">\r\n");
      out.write("						<input type=\"submit\" name=\"save\" value=\"저장\"  class=\"save\" id=\"save\" />\r\n");
      out.write("					</div>\r\n");
      out.write("				</fieldset>\r\n");
      out.write("			</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("	<script src=\"../header.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<script >\r\n");
      out.write("	");
 ResumesDTO Res = (ResumesDTO)session.getAttribute("Resumes");
	UserDTO userinf = (UserDTO)session.getAttribute("session_member");
	
      out.write("\r\n");
      out.write("	  var gen = '");
      out.print( Res != null ? Res.getGender() : "" );
      out.write("';\r\n");
      out.write("// 	  alert(gen);\r\n");
      out.write("	if(gen==\"male\"){\r\n");
      out.write("		$('.male').attr(\"checked\", true);\r\n");
      out.write("	}else{\r\n");
      out.write("		$('.female').attr(\"checked\",true);\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("// 	$('input[name=inputValue]').attr('value',\"test\");\r\n");
      out.write("	$('.userphone').attr(\"value\",\"");
      out.print(userinf.getUserphone() );
      out.write("\")\r\n");
      out.write("	$('.useremail').attr(\"value\",\"");
      out.print(userinf.getUseremail() );
      out.write("\")\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    \r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
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
