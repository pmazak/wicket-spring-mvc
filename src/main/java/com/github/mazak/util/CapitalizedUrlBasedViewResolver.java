package com.github.mazak.util;

import java.util.Locale;

import org.springframework.web.servlet.view.UrlBasedViewResolver;

public class CapitalizedUrlBasedViewResolver extends UrlBasedViewResolver {
	@Override
    protected boolean canHandle(String viewName, Locale locale)
    {
		return isCapitalized(viewName);
    }
	private boolean isCapitalized(String viewName) {
		String firstCharacter = viewName.substring(0, 1);
		return firstCharacter.equals(firstCharacter.toUpperCase());
	}
}
