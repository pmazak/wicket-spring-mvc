package com.github.mazak;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.Request;

public class SpringPage extends WebPage {

	public SpringPage() {
        Request request = getRequest();
        add(new Label("message", request.getRequestParameters().getParameterValue("attrs").toString()));
	}

}
