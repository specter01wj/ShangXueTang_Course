package com.accenture.spm.location;

import java.net.MalformedURLException;
import java.net.URL;

public class LocationURLTest {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://www.google.com:8080/index.html?username=jwang&age=38#page");
		
		System.out.println("Protocol:"+url.getProtocol());
		System.out.println("Domain | IP:"+url.getHost());
		System.out.println("Port:"+url.getPort());
		System.out.println("Request1:"+url.getFile());
		System.out.println("Request2:"+url.getPath());
		
		System.out.println("Param:"+url.getQuery());
		System.out.println("#:"+url.getRef());
	}

}
