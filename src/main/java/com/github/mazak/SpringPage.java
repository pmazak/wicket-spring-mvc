package com.github.mazak;

import org.apache.wicket.markup.html.WebPage;

public class SpringPage extends WebPage {

	SpringPage() {
        Request request = getRequest();
        add(new Label("message", request.getRequestParameters().getParameterValue("attrs").toString()));
	}

}
