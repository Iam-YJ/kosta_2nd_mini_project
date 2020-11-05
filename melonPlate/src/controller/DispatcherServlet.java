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
 * ����� ��û�� �߾����������� �������� FrontController : ����� ��û�� �޾Ƽ� �׿� �ش��ϴ� Controller�� ã�Ƽ�
 * ȣ���ϰ� �� �����(ModelAndView) �޾Ƽ� �ش��ϴ� ���������� �̵���Ų��
 */
@WebServlet(urlPatterns = "/dispatcher", loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet {
	
	private Map<String, Controller> map;
	private Map<String, Class<?>> clzMap;

	@Override
	public void init() throws ServletException {

		System.out.println("init call");
		map = (Map<String, Controller>) super.getServletContext().getAttribute("map");
		clzMap = (Map<String, Class<?>>) super.getServletContext().getAttribute("clzMap");
		System.out.println(clzMap);
		map = (Map<String, Controller>) getServletContext().getAttribute("map");
		clzMap = (Map<String, Class<?>>) getServletContext().getAttribute("clzMap");

	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("��û��");

		String key = request.getParameter("key");

		System.out.println(key);

		String methodName = request.getParameter("methodName");
		System.out.println(methodName);

		Controller con = map.get(key);
		Class<?> cls = clzMap.get(key);

		try {
			Method method = cls.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
			// cls �ȿ��� methodName�� �ش��ϴ� ������ ���� ���̴�

			ModelAndView mv = (ModelAndView) method.invoke(con, request, response);
			// �޼ҵ带 ȣ���ϴ� ��

			if (mv.isRedirect()) {
				response.sendRedirect(mv.getViewName());
			} else {
				request.getRequestDispatcher(mv.getViewName()).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
