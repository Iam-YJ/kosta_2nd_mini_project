package controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dto.Melon;
import model.dto.Noti;

public class AdminController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 *  ���� ��� �޼ҵ� ȣ��
	 */
	public ModelAndView insertRes(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminController�� insertRes ȣ��Ǿ����ϴ�");
		String id = request.getParameter("form-control");
		System.out.println("id = "+id);
		
		return new ModelAndView(request.getContextPath()+"/add-listing-with-menu-list.html", false);
	}

	/**
	 * ���� ���� �޼ҵ� ȣ��
	 */

	public ModelAndView deleteRes(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminController�� deleteRes ȣ��Ǿ����ϴ�");
		return new ModelAndView("index.jsp", true);
	}
	
	
	/**
	 * ���� ���� �޼ҵ� ȣ��
	 */
	
	public ModelAndView updateRes(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminController�� updateRes ȣ��Ǿ����ϴ�");
		return new ModelAndView("index.jsp", true);
	}


	/**
	 *ȸ�� ��� ���� �޼ҵ� ȣ��
	 */
	
	public ModelAndView manageUserGrade(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminController�� manageUserGrade ȣ��Ǿ����ϴ�");
		return new ModelAndView("index.jsp", true);
	}


	/**
	 * �������� �ۼ� �޼ҵ� ȣ��
	 */
	
	public ModelAndView insertNotice(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminController�� insertNotice ȣ��Ǿ����ϴ�");
		return new ModelAndView("index.jsp", true);
	}

	/**
	 * �������� ���� �޼ҵ� ȣ��
	 */
	
	public ModelAndView updateNotice(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminController�� updateNotice ȣ��Ǿ����ϴ�");
		return new ModelAndView("index.jsp", true);
	}


	/**
	 * �������� ���� �޼ҵ� ȣ��
	 */
	
	public ModelAndView deleteNotice(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminController�� deleteNotice ȣ��Ǿ����ϴ�");
		return new ModelAndView("index.jsp", true);
	}


	/**
	 * ȸ�� �߹� �޼ҵ� ȣ��
	 */
	
	public ModelAndView banUser(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminController�� banUser ȣ��Ǿ����ϴ�");
		return new ModelAndView("index.jsp", true);
	}

	
	
}
