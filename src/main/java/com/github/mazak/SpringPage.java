package com.github.mazak;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.protocol.http.servlet.ServletWebRequest;

public class SpringPage extends WebPage {

	public SpringPage() {
		HttpServletRequest request = ((ServletWebRequest) getRequest()).getHttpServletRequest();
        //HttpSession session = ((ServletWebRequest) getRequest()).getHttpServletRequest().getSession();
        Map model = new HashMap();
        Enumeration<String> e = request.getAttributeNames();
        while( e.hasMoreElements() ) {
                String attrName = e.nextElement();
                model.put(attrName, request.getAttribute(attrName));
        }
		add(new Label("message", String.valueOf(model.get("abc"))));
	}
}
