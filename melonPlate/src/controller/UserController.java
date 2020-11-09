package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dto.Melon;
import model.dto.Noti;
import model.dto.User;
import model.service.UserService;

public class UserController implements Controller {

	UserService service = new UserService();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("UserController당");
		return null;
	}

	public ModelAndView join(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("UserController안 join 호출");
		String userNo = request.getParameter("userNo");
		String userNick = request.getParameter("userNick");
		String userAge = request.getParameter("userAge");
		String userEmail = request.getParameter("userEmail");
		String userGender = request.getParameter("userGender");

		/*
		 * System.out.println("userNo = "+ userNo); System.out.println("userNick = "+
		 * userNick); System.out.println("userAge = "+ userAge);
		 * System.out.println("userEmail = "+ userEmail);
		 * System.out.println("userGender = "+ userGender);
		 */

		if (userGender.equals("female")) {
			userGender = "여";
		} else {
			userGender = "남";
		}

		service.joinKakao(Integer.parseInt(userNo), userNick, 20, userEmail, userGender);

		return new ModelAndView("./html/admin_section/add-listing.jsp", true);

	}

	/**
	 * 찜하기 추가
	 */
	public ModelAndView insertBookMark(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("userController의 insertBookMark() 메소드");
		String userNo = request.getParameter("user_no");
		String resNo = request.getParameter("res_no");

		// System.out.println(userNo);

		service.insertBookMark(Integer.parseInt(userNo), Integer.parseInt(resNo));

		// ModelAndView mv = new ModelAndView("dispatcher", true);

		return new ModelAndView("index.html", true);
	}

	/**
	 * 찜하기 삭제
	 */
	public ModelAndView deleteBookMark(HttpServletRequest request, HttpServletResponse response) {
		// 찜하기 삭제 후 찜하기 목록보기 페이지로 이동

		String userNo = request.getParameter("user_no");
		String resNo = request.getParameter("res_no");

		service.deleteBookMark(Integer.parseInt(userNo), Integer.parseInt(resNo));

		ModelAndView mv = new ModelAndView("dispatcher", true);

		return null;
	}

	/**
	 * 찜하기 조회
	 */
	public ModelAndView seleteBookMark(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// 찜하기 목록보기로 이동

		System.out.println("selectBookMark() 메소드");

		String userNo = request.getParameter("user_no");

		List<Melon> list = service.selectBookMark(1);
		request.setAttribute("list", list);
		System.out.println(list);

		ModelAndView mv = new ModelAndView("index.html", false);
		// mv.setViewName("dispatcher/list.jsp");

		return mv;
	}

	/**
	 * 포인트 증가
	 */
	public ModelAndView updatePoint(HttpServletRequest request, HttpServletResponse response) {

		String userNo = request.getParameter("user_no");
		String point = request.getParameter("point");

		service.updatePoint(Integer.parseInt(userNo), Integer.parseInt(point));

		ModelAndView mv = new ModelAndView("dispatcher", true);

		return mv;
	}

	/**
	 * 개인정보수정
	 */
	public ModelAndView updateUserInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String nickname = request.getParameter("nickname");
		String email = request.getParameter("email");
		String prefer = request.getParameter("prefer");
		String userNo = request.getParameter("userNo");

		User user = new User(nickname, email, prefer, Integer.parseInt(userNo));
		service.updateUserInfo(user);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("dispatcher");
		mv.setRedirect(true);
		return mv;
	}

	/**
	 * 유저입장 공지사항 조회
	 */
	public ModelAndView selectNotiByUserNo(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Noti> list = service.selectNotice();
		request.setAttribute("list", list);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("dispatcher/list.jsp");
		return mv;
	}

	/**
	 * 관심분야 추가
	 */
	public ModelAndView interestInsert(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("UserController 안 interestInsert 입니당");
		String[] iList = request.getParameterValues("interests");
		int result = service.interestInsert(iList);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("/melonPlate/html/admin_section/user-profile.jsp");
		mv.setRedirect(true);
		return mv;
	}

}
