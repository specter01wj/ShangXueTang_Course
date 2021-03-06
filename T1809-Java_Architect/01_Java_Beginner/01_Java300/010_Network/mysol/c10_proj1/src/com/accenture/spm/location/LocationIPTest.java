package com.accenture.spm.location;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocationIPTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
		
		InetAddress addr2 = InetAddress.getByName("www.google.com"); 
		System.out.println(addr2.getHostAddress());
		System.out.println(addr2.getHostName());
		
		InetAddress addr3 = InetAddress.getByName("151.101.201.67"); 
		System.out.println(addr3.getHostAddress());
		System.out.println(addr3.getHostName());
		
	}

}
