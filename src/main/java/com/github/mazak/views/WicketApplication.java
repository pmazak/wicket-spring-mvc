package com.github.mazak.views;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.settings.IResourceSettings;
import org.apache.wicket.util.time.Duration;


public class WicketApplication extends WebApplication {

	@Override
	protected void init() {
        configureAlternateHtmlLocation();
		enableHotChanges();
	}

	private void configureAlternateHtmlLocation() {
		IResourceSettings resourceSettings = getResourceSettings();
		resourceSettings.addResourceFolder("");
        resourceSettings.addResourceFolder("WEB-INF/views/");
	}

	private void enableHotChanges() {
		String configurationType = getConfigurationType();
		if (DEVELOPMENT.equalsIgnoreCase(configurationType)) {
			getResourceSettings().setResourcePollFrequency(Duration.ONE_SECOND);
		}
	}

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}
}