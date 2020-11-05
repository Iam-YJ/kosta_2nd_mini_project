package controller;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import controller.ModelAndView;


/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/dispatcher")
public class DispatcherServlet extends HttpServlet {
	private Map<String , Controller> map;
	private Map<String, Class<?>> clzMap;
	
	@Override
	public void init() throws ServletException {
		map = (Map<String, Controller>)getServletContext().getAttribute("map");
		clzMap = (Map<String, Class<?>>)getServletContext().getAttribute("clzMap");
	}
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String key = request.getParameter("command");
		String methodName = request.getParameter("methodName");
		System.out.println("key = " + key + ", methodName = " + methodName);
		
		if(key==null || key.equals("")) key="list";
		
		Controller con = map.get(key);
		Class<?> cls = clzMap.get(key);
		
	  try {
		Method method = cls.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
		ModelAndView mv = (ModelAndView)method.invoke(con, request, response);
		//System.out.println(mv);
		if(mv.isRedirect()) {
			response.sendRedirect(mv.getViewName());
		}else {
            request.getRequestDispatcher(mv.getViewName()).forward(request, response);	
		}
	  }catch (Exception  e) {
		  e.printStackTrace();
		  request.setAttribute("errorMsg", e.getMessage());
		  request.getRequestDispatcher("errorView/error.jsp").forward(request, response);
	  }
	}

}
