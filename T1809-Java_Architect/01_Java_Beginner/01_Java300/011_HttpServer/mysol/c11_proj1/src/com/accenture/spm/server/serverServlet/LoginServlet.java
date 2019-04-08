package com.accenture.spm.server.serverServlet;

public class LoginServlet implements Servlet {

	@Override
	public void  service(Request request,Response response) {
		response.print("<html>"); 
		response.print("<head>"); 
		response.print("<title>");
		response.print("first servlet");
		response.print("</title>");
		response.print("</head>");
		response.print("<body>");
		response.print("Welcome Back: "+request.getParameter("uname"));
		response.print("</body>");
		response.print("</html>");
	}

}
