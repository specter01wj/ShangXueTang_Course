package com.accenture.spm.location;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocationIPTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
	}

}
