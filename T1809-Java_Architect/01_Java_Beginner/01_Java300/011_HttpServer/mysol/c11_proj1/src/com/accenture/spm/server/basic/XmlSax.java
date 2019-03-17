package com.accenture.spm.server.basic;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
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

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("----Analysis Doc Start!----");
	}
	
	

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		System.out.println(qName+" --> Analysis Begin!");
	}

	

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String contents = new String(ch,start,length).trim();
		if(contents.length() > 0) {
			System.out.println("Content->" + contents);			
		}else {
			System.out.println("Content->" + "Empty");		
		}
	}



	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		System.out.println(qName+" --> Analysis Terminated!");
	}



	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("----Analysis Doc End!----");
	}

	
	
}
