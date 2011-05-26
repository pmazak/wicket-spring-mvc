package com.github.mazak;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.mazak.views.HelloPage;
import com.github.mazak.views.WicketApplication;


public class HelloPageTest
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
		tester.startPage(HelloPage.class);
		String renderedHtml = tester.getServletResponse().getDocument();
		Assert.assertTrue(renderedHtml.contains("Hello Wicket page<span wicket:id=\"message\"></span>"));
	}
}