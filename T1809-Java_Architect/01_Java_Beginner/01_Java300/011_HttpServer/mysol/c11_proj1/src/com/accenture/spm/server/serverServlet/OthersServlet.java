package com.accenture.spm.server.serverServlet;

public class OthersServlet implements Servlet {

	@Override
	public void service(Request request,Response response) {
		response.print("Other testing pages!"); 
	}

}