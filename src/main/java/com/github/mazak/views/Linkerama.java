package com.github.mazak.views;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.link.Link;

public class Linkerama extends Link<Object> {

	private static final long serialVersionUID = 1L;

	public Linkerama(final String id) {
		super(id);
	}

	public void onClick() {
	}

	@Override
	protected void onComponentTag(ComponentTag tag) {
		tag.put("href", "javascript:void(0);");
		tag.put("arg", "Aa");
		// super.onComponentTag(tag);

	}
}
