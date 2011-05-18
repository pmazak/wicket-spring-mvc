package com.github.mazak;

import junit.framework.TestCase;

import org.apache.wicket.util.tester.WicketTester;

import com.github.mazak.views.HelloPage;
import com.github.mazak.views.WicketApplication;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage extends TestCase
{
	private WicketTester tester;

	@Override
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}

	public void testRenderMyPage() throws Exception
	{
		//start and render the test page
		tester.startPage(HelloPage.class);

		//assert rendered page class
		//tester.assertRenderedPage(HelloPage.class);
		tester.assertResultPage("HomePage.class");

		//assert rendered label component
		tester.assertLabel("message", "If ayou see this message wicket is properly configured and running");
	}
}
