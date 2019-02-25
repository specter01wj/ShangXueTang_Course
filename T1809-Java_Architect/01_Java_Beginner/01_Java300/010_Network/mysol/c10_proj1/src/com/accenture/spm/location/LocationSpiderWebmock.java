package com.accenture.spm.location;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LocationSpiderWebmock {

	public static void main(String[] args) throws IOException {
		URL url =new URL("https://www.dianping.com");
		
		HttpURLConnection  conn =(HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.109 Safari/537.36");
		BufferedReader br =new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
		String msg =null; 
		while(null!=(msg=br.readLine())) {
			System.out.println(msg);
		}
		br.close();
	}

}
