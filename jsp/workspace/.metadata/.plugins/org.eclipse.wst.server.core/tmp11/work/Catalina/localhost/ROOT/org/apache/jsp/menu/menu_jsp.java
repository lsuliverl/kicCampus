/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-11 08:43:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.phoenix.user.dao.UserDTO;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<!-- Website title -->\r\n");
      out.write("<title>MenuBar</title>\r\n");
      out.write("<!-- CSS Styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/perfect-scrollbar.min.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700&amp;subset=devanagari,latin-ext\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<style >\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Gowun+Batang&display=swap');\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Arvo&display=swap');\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  font-family: \"Gowun Batang\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("	body {\r\n");
      out.write("	\r\n");
      out.write("	background:#f0f3f587;\r\n");
      out.write("	font-size:14px;\r\n");
      out.write("	}\r\n");
      out.write("	p {\r\n");
      out.write("		font-size:1.1em;\r\n");
      out.write("		font-weight:300;\r\n");
      out.write("		line-height:1.7em;\r\n");
      out.write("	}\r\n");
      out.write("	a {\r\n");
      out.write("		color:#7c6dcc;\r\n");
      out.write("	}\r\n");
      out.write("	a,a:hover,a:focus {\r\n");
      out.write("		text-decoration:none;\r\n");
      out.write("		transition:all 0.3s;\r\n");
      out.write("	}\r\n");
      out.write("	.navbar {\r\n");
      out.write("		padding:15px 10px;\r\n");
      out.write("		background:#fff;\r\n");
      out.write("		border:none;\r\n");
      out.write("		border-radius:0;\r\n");
      out.write("		margin-bottom:40px;\r\n");
      out.write("		box-shadow:1px 1px 3px rgba(0,0,0,0.1);\r\n");
      out.write("	}\r\n");
      out.write("	.navbar-btn {\r\n");
      out.write("		box-shadow:none;\r\n");
      out.write("		outline:none !important;\r\n");
      out.write("		border:none;\r\n");
      out.write("	}\r\n");
      out.write("	img {\r\n");
      out.write("		max-width:100%;\r\n");
      out.write("	}\r\n");
      out.write("	.h1,.h2,.h3,.h4,.h5,.h6,h1,h2,h3,h4,h5,h6 {\r\n");
      out.write("		line-height:1.3;\r\n");
      out.write("	}\r\n");
      out.write("	/* --------------------------------------------------- SIDEBAR ----------------------------------------------------- */\r\n");
      out.write(".wrapper {\r\n");
      out.write("}\r\n");
      out.write("#sidebar {\r\n");
      out.write("	min-width:250px;\r\n");
      out.write("	max-width:250px; \r\n");
      out.write("	transition:all 0.6s cubic-bezier(0.945,0.020,0.270,0.665);\r\n");
      out.write("	transform-origin:bottom left;\r\n");
      out.write("	position:fixed;\r\n");
      out.write("	height:100%;\r\n");
      out.write("	background-color:#fff;\r\n");
      out.write("	background-image:none;\r\n");
      out.write("	background-size:auto;\r\n");
      out.write("	background-image:-webkit-linear-gradient(top,#fff 0%,#eaeef2 100%);\r\n");
      out.write("	background-image:linear-gradient(to bottom,#fff 0%,#ffffff 100%);\r\n");
      out.write("	background-repeat:repeat-x;\r\n");
      out.write("	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffffffff',endColorstr='#ffeaeef2',GradientType=0);\r\n");
      out.write("	-webkit-box-shadow:0px 0px 20px 1px rgba(0,0,0,0.2),inset 0px 0px 2px 1px #fff;\r\n");
      out.write("	box-shadow:0px 0px 20px 1px rgba(0,0,0,0.2),inset 0px 0px 2px 1px #fff;\r\n");
      out.write("	z-index:2;\r\n");
      out.write("	border-top:none;\r\n");
      out.write("	top:0;\r\n");
      out.write("	bottom:0;\r\n");
      out.write("}\r\n");
      out.write("#sidebar.active {\r\n");
      out.write("	margin-left:-250px;\r\n");
      out.write("	transform:rotateY(100deg);\r\n");
      out.write("}\r\n");
      out.write("#sidebar .sidebar-header {\r\n");
      out.write("	padding:20px;\r\n");
      out.write("}\r\n");
      out.write("#sidebar ul.components {\r\n");
      out.write("	padding:0;\r\n");
      out.write("  margin-bottom:50px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("#sidebar ul p {\r\n");
      out.write("	padding:10px 20px;\r\n");
      out.write("	margin: 40px;\r\n");
      out.write("}\r\n");
      out.write("#sidebar ul h1 {\r\n");
      out.write("	padding:10px 20px;\r\n");
      out.write("	margin: 40px;\r\n");
      out.write("}\r\n");
      out.write("#sidebar ul li a {\r\n");
      out.write("	padding:10px 20px;\r\n");
      out.write("	font-size:1.1em;\r\n");
      out.write("	display:block;\r\n");
      out.write("	color:inherit;\r\n");
      out.write("	margin-top: 10px\r\n");
      out.write("}\r\n");
      out.write("#sidebar ul li a:hover {\r\n");
      out.write("	color:#7c6dcc;\r\n");
      out.write("	background:#f8f8f8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("a[data-toggle=\"collapse\"] {\r\n");
      out.write("	position:relative;\r\n");
      out.write("}\r\n");
      out.write("a[aria-expanded=\"false\"]::before,a[aria-expanded=\"true\"]::before {\r\n");
      out.write("	display:block;\r\n");
      out.write("	position:absolute;\r\n");
      out.write("	right:20px;\r\n");
      out.write("	font-family:FontAwesome;\r\n");
      out.write("	font-size:0.8em;\r\n");
      out.write("	content:\"\\f0d7\";\r\n");
      out.write("}\r\n");
      out.write("a[aria-expanded=\"true\"]::before {\r\n");
      out.write("	content:\"\\f0d7\";\r\n");
      out.write("}\r\n");
      out.write("ul ul a {\r\n");
      out.write("	font-size:0.9em !important;\r\n");
      out.write("	padding-left:30px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-footer {\r\n");
      out.write("  padding: 20px 20px 20px 20px;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  text-align:center !important;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-footer p {\r\n");
      out.write("	font-size:12px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-footer .social-icons a {\r\n");
      out.write("	width:25px;\r\n");
      out.write("	height:25px;\r\n");
      out.write("	background:rgb(255, 63, 30);\r\n");
      out.write("	color:#fff;\r\n");
      out.write("	display:inline-block;\r\n");
      out.write("	text-align:center;\r\n");
      out.write("	line-height:25px;\r\n");
      out.write("	border-radius:50%;\r\n");
      out.write("	margin-right:3px;\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-footer .social-icons a:hover {\r\n");
      out.write("  background-color:rgb(210, 48, 20);\r\n");
      out.write("  color:#fff;\r\n");
      out.write("}\r\n");
      out.write("#sidebarCollapse {\r\n");
      out.write("	width:50px;\r\n");
      out.write("	height:50px;\r\n");
      out.write("	background:#7c6dcc;\r\n");
      out.write("	color:#fff;\r\n");
      out.write("	position:absolute;\r\n");
      out.write("	top:-10px;\r\n");
      out.write("	right:-10px;\r\n");
      out.write("}\r\n");
      out.write("#sidebarCollapse span {\r\n");
      out.write("	width:80%;\r\n");
      out.write("	height:2px;\r\n");
      out.write("	margin:0 auto;\r\n");
      out.write("	display:block;\r\n");
      out.write("	background:#fff;\r\n");
      out.write("	transition:all 0.8s cubic-bezier(0.810,-0.330,0.345,1.375);\r\n");
      out.write("	transition-delay:0.2s;\r\n");
      out.write("}\r\n");
      out.write("#sidebarCollapse span:first-of-type {\r\n");
      out.write("	transform:rotate(45deg) translate(2px,2px);\r\n");
      out.write("}\r\n");
      out.write("#sidebarCollapse span:nth-of-type(2) {\r\n");
      out.write("	opacity:0;\r\n");
      out.write("}\r\n");
      out.write("#sidebarCollapse span:last-of-type {\r\n");
      out.write("	transform:rotate(-45deg) translate(1px,-1px);\r\n");
      out.write("}\r\n");
      out.write("#sidebarCollapse.active span {\r\n");
      out.write("	transform:none;\r\n");
      out.write("	opacity:1;\r\n");
      out.write("	margin:5px auto;\r\n");
      out.write("}\r\n");
      out.write("#sidebar-responsive {\r\n");
      out.write("	display:none;\r\n");
      out.write("}\r\n");
      out.write(".imglogo {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("  margin-bottom:15px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

	String loginhref = "/login/login.jsp";
	String portfoliohref = "#";
	String coverletterhref = "#";
	String resumeshref = "#";
	String mypagehref = "/my_page/MyPage.my";
	String avalue = "로그인"; 
	
	//세션에서 로그인 정보 가져오기
	UserDTO member = (UserDTO)session.getAttribute("session_member");
	
	if(member==null){
		//로그인x
		portfoliohref = "/menu/menucontroller.jsp";
		coverletterhref ="/menu/menucontroller.jsp";
		resumeshref = "/menu/menucontroller.jsp";
		mypagehref = "/menu/menucontroller.jsp";
	}else{
		//로그인o
		loginhref = "/logout/logout.jsp";
		portfoliohref = "/portfolio/portfolio.jsp";
		coverletterhref = "/cover_letter/cover_letter.jsp";
		resumeshref = "/resume/dbload.jsp";
		mypagehref = "/my_page/MyPage.my";
		avalue = "로그아웃";
	}


      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- BEGIN Wrapper -->\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("	<!-- BEGIN Sidebar -->\r\n");
      out.write("	<nav id=\"sidebar\">\r\n");
      out.write("	<div class=\"sidebar-header\">\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("	<ul class=\"list-unstyled components\">\r\n");
      out.write("		<h1 class=\"site-title\" align=\"center\" style=\"font-family:'Arvo' ,sans-serif !important; font-weight: 500;\">\r\n");
      out.write("		Phoenix </h1>\r\n");
      out.write("		<p>\r\n");
      out.write("			<a href=\"");
      out.print(loginhref );
      out.write("\" id=\"menulogin\" class = \"menulogin\" name=\"menulogin\">");
      out.print(avalue );
      out.write("</a>\r\n");
      out.write("		</p>\r\n");
      out.write("		<li>\r\n");
      out.write("			<a href=\"");
      out.print(portfoliohref );
      out.write("\" id=\"menuportfolio\" class = \"menuportfolio\" name=\"menuportfolio\">포트폴리오</a>\r\n");
      out.write("		</li>\r\n");
      out.write("		<li>\r\n");
      out.write("			<a href=\"");
      out.print(coverletterhref );
      out.write("\" id=\"menucoverletter\" class = \"menucoverletter\" name=\"menucoverletter\">자기소개서</a>\r\n");
      out.write("		</li>\r\n");
      out.write("		<li>\r\n");
      out.write("			<a href=\"");
      out.print(resumeshref );
      out.write("\" id=\"menuresumes\" class = \"menuresumes\" name=\"menuresumes\">이력서</a>\r\n");
      out.write("		</li>\r\n");
      out.write("		<li>\r\n");
      out.write("			<a href=\"");
      out.print(mypagehref );
      out.write("\" id=\"menumypage\" class = \"menumypage\" name=\"menumypage\">내정보</a>\r\n");
      out.write("		</li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	\r\n");
      out.write("	</nav>\r\n");
      out.write("  <!-- END Sidebar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!--END Wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN Scripts -->\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/tether.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("<script src=\"js/common.js\"></script>\r\n");
      out.write("<!-- END Scripts -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
