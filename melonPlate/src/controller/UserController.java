package controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ModelAndView;
import model.dto.Melon;
import model.dto.Noti;
import model.dto.User;
import model.service.UserService;

@WebServlet("/user")
public class UserController implements Controller {
	
	UserService service = new UserService();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("UserController��");
		return null;
	}
	
	/**
	 * ���ϱ� �߰�
	 */
	public ModelAndView insertBookMark(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("userController�� insertBookMark() �޼ҵ�");
		String userNo = request.getParameter("user_no");
		String resNo = request.getParameter("res_no");
		
		//System.out.println(userNo);
		
		service.insertBookMark(Integer.parseInt(userNo), Integer.parseInt(resNo));
		
		//ModelAndView mv = new ModelAndView("dispatcher", true);
		
		return new ModelAndView("html/detail-restaurant.jsp", true);
	}
	
	
	/**
	 * ���ϱ� ���� 
	 */
	public ModelAndView deleteBookMark(HttpServletRequest request, HttpServletResponse response) {
		//���ϱ� ���� �� ���ϱ� ��Ϻ��� �������� �̵�
		System.out.println("deleteBookMark() �޼ҵ�");
		String userNo = request.getParameter("user_no");
		String resNo = request.getParameter("res_no");
		System.out.println("userNo: " + userNo);
		System.out.println("resNo: " + resNo);
		
		service.deleteBookMark(Integer.parseInt(userNo), Integer.parseInt(resNo));
		
		return new ModelAndView("dispatcher?key=user&methodName=seleteBookMark&user_no="+Integer.parseInt(userNo), true);
	}
	
	
	/**
	 * ���ϱ� ��ȸ 
	 */
	public ModelAndView seleteBookMark(HttpServletRequest request, HttpServletResponse response) throws SQLException{
		//���ϱ� ��Ϻ���� �̵� 
		
		System.out.println("selectBookMark() �޼ҵ�");
		
		String userNo = request.getParameter("user_no");
		System.out.println("userNo: " + userNo);
		List<Melon> list = service.selectBookMark(Integer.parseInt(userNo));
		request.setAttribute("list", list);
		System.out.println(list);
		
		return new ModelAndView("html/admin_section/bookmarks.jsp", false);
	}
	
	
	/**
	 * ����Ʈ ���� 
	 */
	public ModelAndView updatePoint(HttpServletRequest request, HttpServletResponse response) {
		
		String userNo = request.getParameter("user_no");
		String point = request.getParameter("point");
		
		service.updatePoint(Integer.parseInt(userNo), Integer.parseInt(point));
		
		ModelAndView mv = new ModelAndView("dispatcher", true);
		
		return mv;
	}
	
	
	/**
	 *  ȸ������ ��ȸ
	 * */
	public ModelAndView selectUserInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("UserController selectUserInfo() �޼ҵ�");
		String userNo = request.getParameter("user_no");
		
		User user = service.selectUserInfo(Integer.parseInt(userNo));
		request.setAttribute("user", user);

		return new ModelAndView("html/admin_section/user-profile.jsp", false);
	}
	
	
	/**
	 *  ȸ����������
	 * */
	public ModelAndView updateUserInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("updateUserInfo() �޼ҵ�");
		String nickname =request.getParameter("new_nickname");
		String email = request.getParameter("new_email");
		String prefer = request.getParameter("new_prefer");
		String userNo = request.getParameter("user_no");
		
		System.out.println("nickname: " + nickname);
		System.out.println("email: " + email);
		System.out.println("prefer: " + prefer);
		System.out.println("userNo: " + userNo);
		
		User user = new User(nickname, email, prefer, Integer.parseInt(userNo));
		service.updateUserInfo(user);
		
		return new ModelAndView("dispatcher?key=user&methodName=selectUserInfo&user_no="+Integer.parseInt(userNo), true);
	}
	
	/**
	 * �������� �������� ��ȸ
	 * */
	public ModelAndView selectNotice(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Noti> list = service.selectNotice();
		request.setAttribute("list", list);
		
		return new ModelAndView("html/admin_section/orders.jsp", false);
	}
	
	/**
	 * �������� ���� ����
	 */
	public ModelAndView selectNotiByNotiNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("userController �������׻󼼺���");
		String notiNo = request.getParameter("noti_no");
		System.out.println("notiNo: " + notiNo);
		Noti noti = service.selectNotiByNotiNo(Integer.parseInt(notiNo));
		System.out.println("noti: " + noti);
		request.setAttribute("noti", noti);
		
		return new ModelAndView("html/admin_section/notice-detail.jsp", false);
	}


}
