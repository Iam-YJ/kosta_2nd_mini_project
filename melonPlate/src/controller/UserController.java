package controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ModelAndView;
import model.dto.Melon;
import model.service.UserService;

public class UserController implements Controller {
	
	UserService service = new UserService();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("UserController��");
		return null;
	}
	
	public ModelAndView insertBookMark(HttpServletRequest request, HttpServletResponse response) {
		//���ϱ� �߰� �� ���ϱ� ��Ϻ��� �������� �̵� 
		
		String userNo = request.getParameter("user_no");
		String resNo = request.getParameter("res_no");
		
		//System.out.println(userNo);
		
		service.insertBookMark(Integer.parseInt(userNo), Integer.parseInt(resNo));
		
		//ModelAndView mv = new ModelAndView("dispatcher", true);
		
		return new ModelAndView("index.html", true);
	}
	
	public ModelAndView deleteBookMark(HttpServletRequest request, HttpServletResponse response) {
		//���ϱ� ���� �� ���ϱ� ��Ϻ��� �������� �̵�
		
		String userNo = request.getParameter("user_no");
		String resNo = request.getParameter("res_no");
		
		service.deleteBookMark(Integer.parseInt(userNo), Integer.parseInt(resNo));
		
		ModelAndView mv = new ModelAndView("dispatcher", true);
		
		return null;
	}
	
	public ModelAndView seleteBookMark(HttpServletRequest request, HttpServletResponse response) throws SQLException{
		//���ϱ� ��Ϻ���� �̵� 
		
		System.out.println("selectBookMark() �޼ҵ�");
		
		String userNo = request.getParameter("user_no");
		
		List<Melon> list = service.selectBookMark(1);
		request.setAttribute("list", list);
		System.out.println(list);
		
		ModelAndView mv = new ModelAndView("index.html", false);
		//mv.setViewName("dispatcher/list.jsp");
		
		return mv;
	}
	
	public ModelAndView updatePoint(HttpServletRequest request, HttpServletResponse response) {
		//������������ �̵� 
		
		String userNo = request.getParameter("user_no");
		String point = request.getParameter("point");
		
		service.updatePoint(Integer.parseInt(userNo), Integer.parseInt(point));
		
		ModelAndView mv = new ModelAndView("dispatcher", true);
		
		return mv;
	}
}
