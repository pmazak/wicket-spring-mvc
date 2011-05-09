package com.github.mazak;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.time.Duration;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see com.github.mazak.Start#main(String[])
 */
public class WicketApplication extends WebApplication {

	@Override
	protected void init() {
		String configurationType = getConfigurationType();
		if (DEVELOPMENT.equalsIgnoreCase(configurationType)) {
			getResourceSettings().setResourcePollFrequency(Duration.ONE_SECOND);
		}
	}

	/**
	 * Constructor
	 */
	public WicketApplication() {
	}

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<HomePage> getHomePage() {
		return HomePage.class;
	}

}
