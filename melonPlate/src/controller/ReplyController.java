package controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dto.Reply;
import model.service.ReplyService;
import model.service.UserService;

public class ReplyController implements Controller {
	
	ReplyService service = new ReplyService();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * ���� ��ü �˻� - �Ĵ�
	 */
	public ModelAndView selectReplyByResNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("replyController �Ĵ纰����˻�");
		String resNo = request.getParameter("res_no"); 
		System.out.println("resNo: " + resNo);
		List<Reply> list= service.selectReplyByResNo(Integer.parseInt(resNo));
		request.setAttribute("list", list);
		request.setAttribute("count", list.size());
		
		return new ModelAndView("html/detail-restaurant.jsp", false);
	}
	
	/**
	 * ���� ��ü �˻� - ����������
	 */
	public ModelAndView selectReplyByUserNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("������ü�˻�");
		String userNo = request.getParameter("user_no"); 
		System.out.println("userNo: " + userNo);
		
		List<Reply> list= service.selectReplyByUserNo(Integer.parseInt(userNo));
		request.setAttribute("list", list);
		request.setAttribute("count", list.size());
		
		System.out.println("list: " + list);
		
		return new ModelAndView("html/admin_section/reviews.jsp", false);
	}
	
	/**
	 * ���� ����
	 */
	public ModelAndView updateReply(HttpServletRequest request, HttpServletResponse response)throws Exception {
		System.out.println("updateReply() �޼ҵ�");
		String resNo = request.getParameter("resNo"); 
		String userNo = request.getParameter("userNo"); 
		String repGrade = request.getParameter("repGrade"); 
		//String repPhoto = request.getParameter("repPhoto");
		String repContent = request.getParameter("repContent");
		System.out.println("resNo: " + resNo);
		System.out.println("userNo: " + userNo);
		System.out.println("repGrade: " + repGrade);
		System.out.println("repContent: " + repContent);
		
		Reply reply = new Reply(Integer.parseInt(resNo), Integer.parseInt(userNo), Integer.parseInt(repGrade), null, repContent);
		
		service.updateReply(reply);
		
		return new ModelAndView("dispatcher?key=reply&methodName=selectReplyByUserNo&user_no="+Integer.parseInt(userNo), true);
	}
	
	/**
	 * ���� ����
	 */
	public ModelAndView deleteReply(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		String resNo = request.getParameter("res_no"); 
		String userNo = request.getParameter("user_no"); 
		System.out.println("resNo: " + resNo);
		System.out.println("userNo: " + userNo);
		
		service.deleteReply(Integer.parseInt(resNo), Integer.parseInt(userNo));
		
		return new ModelAndView("dispatcher?key=reply&methodName=selectReplyByUserNo&user_no="+Integer.parseInt(userNo), true);
	}
	
	/**
	 * ���� ���
	 */
	public ModelAndView insertReply(HttpServletRequest request, HttpServletResponse response)throws Exception {
		System.out.println("replyController insert");
		String resNo = request.getParameter("res_no"); 
		String userNo = request.getParameter("user_no"); 
		String repGrade = request.getParameter("food_quality"); 
		//String repPhoto = request.getParameter("review_photo");
		String repContent = request.getParameter("review_content");
		
		System.out.println("resNo: " + resNo);
		System.out.println("userNo: " + userNo);
		System.out.println("repGrade: " + repGrade);
		//System.out.println("repPhoto: " + repPhoto);
		System.out.println("repContent: " + repContent);
		
		Reply reply = new Reply(Integer.parseInt(resNo), Integer.parseInt(userNo), Integer.parseInt(repGrade), null, repContent);
		System.out.println("reply: " + reply);
		service.insertReply(reply);
		
		return new ModelAndView("html/detail-restaurant.jsp", true);
	}
	
	/**
	 * ���� ������ ���� 
	 */
	public ModelAndView incrementLike(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String resNo = request.getParameter("res_no");
		String userNo = request.getParameter("user_no");
		
		service.incrementLike(Integer.parseInt(resNo), Integer.parseInt(userNo));
		return new ModelAndView("index.html", true);
	}
	
	/**
	 * �Ĵ��ȣ, ������ȣ�� �ش��ϴ� ���� �������� 
	 */
	public ModelAndView selectReplyByResNoAndUserNo(HttpServletRequest request, HttpServletResponse response)throws Exception {
		System.out.println("selectReplyByResNoAndUserNo() �޼ҵ�");
		String resNo = request.getParameter("res_no");
		String userNo = request.getParameter("user_no");
		System.out.println("resNo: " + resNo + ", " + "userNo: " + userNo);
		
		Reply reply = service.selectReplyByResNoAndUserNo(Integer.parseInt(resNo), Integer.parseInt(userNo));
		request.setAttribute("reply", reply);
		System.out.println("reply: " + reply);
		
		return new ModelAndView("html/update-review.jsp", false);
	}
	
}
