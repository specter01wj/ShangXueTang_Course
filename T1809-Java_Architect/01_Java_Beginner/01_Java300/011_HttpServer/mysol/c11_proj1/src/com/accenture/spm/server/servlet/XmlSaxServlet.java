package com.accenture.spm.server.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlSaxServlet {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//SAX解析
		//1、获取解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2、从解析工厂获取解析器
		SAXParser parse = factory.newSAXParser();
		//3、编写处理器
		//4、加载文档 Document 注册处理器
		WebHandler handler=new WebHandler();
		//5、解析
		parse.parse(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("web.xml"), handler);
		
		//获取数据
		List<Entity> entitys = handler.getEntitys();
		List<Mapping> mappings = handler.getMappings();
		System.out.println(entitys.size());
		System.out.println(mappings.size());
	}

}

class WebHandler extends DefaultHandler{

	private List<Entity> entitys  = new ArrayList<Entity>();
	private List<Mapping> mappings = new ArrayList<Mapping>();
	private Entity entity ;
	private Mapping mapping ;
	
	private String tag;
	private boolean isMapping = false;
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		System.out.println(qName+" --> Analysis Begin!");
		if(null!=qName) {
			tag = qName;
			if(tag.equals("servlet")) {
				entity = new Entity();
				isMapping = false;
			}else if(tag.equals("servlet-mapping")) {
				mapping = new Mapping();
				isMapping = true;
			}
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String contents = new String(ch,start,length).trim();
		
		if(null!=tag) {
			if(isMapping) {
				if(tag.equals("servlet-name")) {
					mapping.setName(contents);
				}else if(tag.equals("url-pattern")) {
					mapping.addPattern(contents);
				}
			}else {
				if(tag.equals("servlet-name")) {
					entity.setName(contents);
				}else if(tag.equals("servlet-class")) {
					entity.setClz(contents);
				}
			}
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		if(null!=qName) { 
			if(qName.equals("servlet")) {
				entitys.add(entity);
			}else if(qName.equals("servlet-mapping")) {
				mappings.add(mapping);
			}
		}
		tag = null;
		System.out.println(qName+" --> Analysis Terminated!");
	}

	public List<Entity> getEntitys() {
		return entitys;
	}

	public List<Mapping> getMappings() {
		return mappings;
	}

	
	
	
	
	
	
	
	
	
	
	
}
