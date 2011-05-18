package com.github.mazak.views;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.protocol.http.servlet.ServletWebRequest;

public class HelloPage extends WebPage {

	protected Map getModel() {
		HttpServletRequest request = ((ServletWebRequest) getRequest()).getHttpServletRequest();
        //HttpSession session = ((ServletWebRequest) getRequest()).getHttpServletRequest().getSession();
        Map model = new HashMap();
        Enumeration<String> e = request.getAttributeNames();
        while( e.hasMoreElements() ) {
                String attrName = e.nextElement();
                model.put(attrName, request.getAttribute(attrName));
        }
        return model;
	}	
	public HelloPage(final PageParameters parameters) {
		Map model = getModel();
		add(new Label("message", (model.get("message") == null ? "" : String.valueOf(model.get("message")))));
	}
}
