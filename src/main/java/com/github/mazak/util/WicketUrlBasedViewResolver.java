package com.github.mazak.util;

import java.util.Locale;

import org.springframework.web.servlet.view.UrlBasedViewResolver;

public class WicketUrlBasedViewResolver extends UrlBasedViewResolver {
	@Override
    protected boolean canHandle(String viewName, Locale locale)
    {
		boolean isWicketView = viewName.contains(".");
    	return isWicketView;
    }
}
