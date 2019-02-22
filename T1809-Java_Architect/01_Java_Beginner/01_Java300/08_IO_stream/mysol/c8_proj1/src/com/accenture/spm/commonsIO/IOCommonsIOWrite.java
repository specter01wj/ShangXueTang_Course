package com.accenture.spm.commonsIO;

public class IOCommonsIOWrite {

	public static void main(String[] args) {
		
		FileUtils.write(new File("happy.sxt"), "The father of a so-called\r\n","UTF-8");
		FileUtils.writeStringToFile(new File("happy.sxt"), "who was born and raised in the U.S.\r\n","UTF-8",true);
		FileUtils.writeByteArrayToFile(new File("happy.sxt"), "and now wants to return home with her son\r\n".getBytes("UTF-8"),true);
		
		List<String> datas =new ArrayList<String>();
		datas.add("James");
		datas.add("Kim");
		datas.add("George");
		
		FileUtils.writeLines(new File("happy.sxt"), datas,"。。。。。",true);

	}

}
