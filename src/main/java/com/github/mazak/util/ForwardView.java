package com.github.mazak.util;

import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.InternalResourceView;

public class ForwardView extends InternalResourceView {

//	@Override
//	protected void renderMergedOutputModel(Map map, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		String path = getUrl();
//		RequestDispatcher rd = request.getRequestDispatcher(path);
//		rd.forward(request, response);
//	}
}
