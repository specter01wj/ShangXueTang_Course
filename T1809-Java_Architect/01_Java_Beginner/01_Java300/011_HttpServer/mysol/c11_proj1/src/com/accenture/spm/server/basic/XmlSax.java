package com.accenture.spm.server.basic;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlSax {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//SAX解析
		//1、获取解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2、从解析工厂获取解析器
		SAXParser parse = factory.newSAXParser();
		//3、编写处理器
		//4、加载文档 Document 注册处理器
		PHandler handler=new PHandler();
		//5、解析
		parse.parse(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("p.xml"), handler);
	}

}

class PHandler extends DefaultHandler{

	
	
}
