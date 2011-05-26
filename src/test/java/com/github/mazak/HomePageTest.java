package com.github.mazak;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.mazak.views.HomePage;
import com.github.mazak.views.WicketApplication;


public class HomePageTest
{
	private static WicketTester tester;

	@BeforeClass
	public static void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}

	@Test
	public void testRenderMyPage()
	{
		tester.startPage(HomePage.class);
		String expectedLabelText = "If you see this message wicket is properly configured and running.";
		String renderedHtml = tester.getServletResponse().getDocument();
		Assert.assertTrue(renderedHtml.contains("<span wicket:id=\"message\">"+expectedLabelText+"</span>"));
		tester.assertLabel("message", expectedLabelText);
	}
}