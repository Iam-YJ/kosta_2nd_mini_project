package controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dto.Reply;
import model.service.ReplyService;

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
		String resNo = request.getParameter("res_no"); 
		
		List<Reply> list= service.selectReplyByResNo(Integer.parseInt(resNo));
		request.setAttribute("list", list);
		
		return new ModelAndView("index.html", false);
	}
	
	/**
	 * ���� ��ü �˻� - ����������
	 */
	public ModelAndView selectReplyByUserNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String userNo = request.getParameter("user_no"); 
		
		List<Reply> list= service.selectReplyByResNo(Integer.parseInt(userNo));
		request.setAttribute("list", list);
		
		return new ModelAndView("index.html", false);
	}
	
	/**
	 * ���� ����
	 */
	public ModelAndView updateReply(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		String resNo = request.getParameter("resNo"); 
		String userNo = request.getParameter("userNo"); 
		String repGrade = request.getParameter("repGrade"); 
		String repPhoto = request.getParameter("repPhoto");
		String repContent = request.getParameter("repContent");
		
		Reply reply = new Reply(Integer.parseInt(resNo), Integer.parseInt(userNo), Integer.parseInt(repGrade), repPhoto, repContent);
		
		service.updateReply(reply);
		
		return new ModelAndView("index.html", true);
	}
	
	/**
	 * ���� ����
	 */
	public ModelAndView deleteReply(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		String resNo = request.getParameter("resNo"); 
		String userNo = request.getParameter("userNo"); 
		
		service.deleteReply(Integer.parseInt(resNo), Integer.parseInt(userNo));
		
		return new ModelAndView("index.html", true);
	}
	
	/**
	 * ���� ���
	 */
	public ModelAndView insertReply(HttpServletRequest request, HttpServletResponse response)throws Exception {
		System.out.println("replyController insert");
		String resNo = request.getParameter("resNo"); 
		String userNo = request.getParameter("userNo"); 
		String repGrade = request.getParameter("repGrade"); 
		String repPhoto = request.getParameter("repPhoto");
		String repContent = request.getParameter("repContent");
		
		Reply reply = new Reply(Integer.parseInt(resNo), Integer.parseInt(userNo), Integer.parseInt(repGrade), repPhoto, repContent);
		System.out.println("reply: " + reply);
		service.insertReply(reply);
		
		return new ModelAndView("index.html", true);
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
	
	

}
