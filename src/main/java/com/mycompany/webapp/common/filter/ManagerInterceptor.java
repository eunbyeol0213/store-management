package com.mycompany.webapp.common.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 담당자에 해당하는 접근 권한을 확인하는 인터셉터
 * @author 임유진
 * */
public class ManagerInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	
		int userCode = (int)request.getSession().getAttribute("userCode");
		if(userCode >= 20000) {
			//요청 이전 페이지로 redirect
			response.sendRedirect(request.getHeader("referer"));
			
			return false;
		}
		
		return true;
	}
}
