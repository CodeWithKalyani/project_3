/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2023-11-01 09:46:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.controller.ORSView;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1698386562000L));
    _jspx_dependants.put("/jsp/FooterView.jsp", Long.valueOf(1698350852000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.project_3.dto.RoleDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.UserDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.ORSView");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Welcome Page</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	background-image: url('");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/university_img.jpg');\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cl {\r\n");
      out.write("	/* font-family:;\r\n");
      out.write("	font-family: Monotype Corsiva;\r\n");
      out.write("	font-family: Footlight MT Light;\r\n");
      out.write(" */\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"img-fluid\">\r\n");
      out.write("	<div class=\"header\">\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"\r\n");
      out.write("	integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".reg {\r\n");
      out.write("	background-image: linear-gradient(to bottom right, white, grey);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

		UserDTO userDto = (UserDTO) session.getAttribute("user");

		boolean userLoggedIn = userDto != null;

		String welcomeMsg = "Hi, ";

		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userDto.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\r\n");
      out.write("	<div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg reg fixed-top\"> <a\r\n");
      out.write("			class=\"navbar-brand\" href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><img\r\n");
      out.write("			src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/custom.png\" width=\"190px\"\r\n");
      out.write("			height=\"50px\"></a>\r\n");
      out.write("\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("			data-target=\"#navbarNav\" aria-controls=\"navbarNav\"\r\n");
      out.write("			aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"> <i class=\"fas fa-bars\"\r\n");
      out.write("				style=\"color: #fff; font-size: 28px;\"></i></span>\r\n");
      out.write("\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("\r\n");
      out.write("			<ul class=\"nav navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("				<a class=\"nav-link\" href=\"#\"> <span class=\"sr-only\">(current)</span>\r\n");
      out.write("				</a>\r\n");
      out.write("				");

					if (userLoggedIn) {
				
      out.write("\r\n");
      out.write("				");

					if (userDto.getRoleId() == RoleDTO.STUDENT) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Marksheet</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("								class=\" far fa-file-alt\"></i>Marksheet Merit List</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">User</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\r\n");
      out.write("\r\n");
      out.write("								Profile</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><i\r\n");
      out.write("								class=\" fa fa-file-alt\"></i>Change Password</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				");

					} else if (userDto.getRoleId() == RoleDTO.ADMIN) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px;\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">User</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-circle\"></i>Add User</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-friends\"></i>User List</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Marksheet\r\n");
      out.write("\r\n");
      out.write("					</font></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"far fa-file\"></i>Add Marksheet</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-paste\"></i>Marksheet List</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\" far fa-file-alt\"></i>Marksheet Merit List </a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"far fa-copy\"></i>Get Marksheet</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Role</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-tie\"></i>Add Role</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-friends\"></i>Role List</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">College</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-university\"></i>Add College</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-building\"></i>College List </a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Course\r\n");
      out.write("\r\n");
      out.write("					</font></a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-book-open\"></i>Add Course</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-sort-amount-down\"></i>Course List </a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Student</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"far fa-user-circle\"></i>Add Student</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-users\"></i>Student List</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Faculty\r\n");
      out.write("\r\n");
      out.write("					</font></a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-tie\"></i>Add Faculty</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class=\" fas fa-users\"></i>Faculty\r\n");
      out.write("\r\n");
      out.write("							List</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Time\r\n");
      out.write("\r\n");
      out.write("							Table</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-clock\"></i>Add TimeTable</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"far fa-clock\"></i>TimeTable List</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Subject</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-calculator\"></i>Add Subject</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"> <i\r\n");
      out.write("							class=\"fas fa-sort-amount-down\"></i>Subject List\r\n");
      out.write("\r\n");
      out.write("						</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				");

					}
					}
				
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\"\r\n");
      out.write("					style=\"padding-left: 5px; padding-right: 67px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"><font style=\"color: white;\">");
      out.print(welcomeMsg);
      out.write("\r\n");
      out.write("					</font></a>\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("						");

							if (userLoggedIn) {
						
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-sign-out-alt\"></i>Logout </a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\r\n");
      out.write("							Profile</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"> <i\r\n");
      out.write("							class=\"fas fa-edit\"></i>Change Password\r\n");
      out.write("						</a> <a class=\"dropdown-item\" target=\"blank\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"><i class=\"fas fa-clone\"></i>Java\r\n");
      out.write("							Doc </a>\r\n");
      out.write("						");

							} else {
						
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-sign-in-alt\"><b> Login</b></i> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\"><i\r\n");
      out.write("								class=\"fas fa-registered\"><b> User Registration</b></i></a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				");

					}
				
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"text-cs1\" >\r\n");
      out.write("		 scrollamount=\"15\" behavior=\"alternate\">\r\n");
      out.write("			<h1 style=\"padding-top: 19%; color: blue;  text-align: center;\">\r\n");
      out.write("				<b class=\"cl\">Welcome To Online Result System</b>\r\n");
      out.write("			</h1>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write(" position: fixed;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   bottom: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("/*      background-color: #343a40;\r\n");
      out.write(" */      color: white;\r\n");
      out.write("   text-align: center;\r\n");
      out.write(" background-image:  linear-gradient(to bottom right, white, black, grey);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<h5>&copy; RAYS Technologies</h5></center>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
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
