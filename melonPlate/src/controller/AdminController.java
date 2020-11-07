package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dto.Melon;
import model.service.AdminService;

@WebServlet("/admin")

public class AdminController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ���� ��� �޼ҵ� ȣ��
	 */
	public ModelAndView insertRes(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("AdminController�� insertRes ȣ��Ǿ����ϴ�");

		String resName = request.getParameter("resName");
		String resTel = request.getParameter("resTel");
		String resLoc = request.getParameter("resLoc");
		String resLocDetail = request.getParameter("resLocDetail");
		String resKind = request.getParameter("resKind");
		String resMenu = request.getParameter("resMenu");
		String resPrice = request.getParameter("resPrice");
		String resPhoto = request.getParameter("resPhoto");
		String resPlace = resLoc + resLocDetail;

		/*
		 * System.out.println(resName); System.out.println(resTel);
		 * System.out.println(resLoc); System.out.println(resLocDetail);
		 * System.out.println(resKind); System.out.println(resMenu);
		 * System.out.println(resPrice); System.out.println(resPhoto);
		 * System.out.println(resPlace);
		 */

		Melon melon = new Melon(resName, resPlace, resTel, resKind, resPhoto, resPrice);

		AdminService.insertRes(melon);

		ModelAndView mv = new ModelAndView("html/admin_section/add-listing-with-menu-list.jsp", true);

		return mv;
		// new ModelAndView(request.getContextPath() +
		// "/add-listing-with-menu-list.html", false);

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
	 * ȸ�� ��� ���� �޼ҵ� ȣ��
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
