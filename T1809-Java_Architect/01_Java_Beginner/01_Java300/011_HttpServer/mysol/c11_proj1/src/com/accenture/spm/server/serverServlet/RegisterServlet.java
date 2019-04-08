package com.accenture.spm.server.serverServlet;

public class RegisterServlet implements Servlet {

	@Override
	public void service(Request request,Response response) {
		response.print("Register Success!!!"); 
	}

}
