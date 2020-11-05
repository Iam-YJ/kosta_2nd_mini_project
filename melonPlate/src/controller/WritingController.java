package controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ModelAndView;
import model.dto.Melon;
import model.dto.WriList;
import model.dto.Writing;
import model.service.WritingService;

@WebServlet("/writing")
public class WritingController implements Controller {
	
	WritingService service = new WritingService();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ModelAndView selectByName(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String resName = request.getParameter("res_name");
		
		List<Melon> list = service.selectByName(resName);
		
		request.setAttribute("list", list);
		
		//ModelAndView mv = new ModelAndView("index.html",false);
		//mv.setViewName("index.html");
		
		//System.out.println(list);
		
		return new ModelAndView("index.html", false);
	}
	
	/**
	 * �� �ۼ� 
	 */
	public ModelAndView insertWriting(HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("WritingController�� insertWriting() �޼ҵ�");
		String wriTitle = request.getParameter("wri_title");
		String userNo = request.getParameter("user_no");
		String resNo = request.getParameter("res_no");
		String wriContent = request.getParameter("wri_content");
		System.out.println(wriTitle + ", " + userNo + ", " + resNo + ", " + wriContent);
		
		Writing writing = new Writing(0, wriTitle, null, Integer.parseInt(userNo));
		WriList wriList = new WriList(0, 0, Integer.parseInt(resNo), wriContent);
		writing.getWriList().add(wriList);
		
		service.insertWriting(writing);
		
		return new ModelAndView("index.html", true);
	}
	
	
	/**
	 * �� ���� 
	 */
	public ModelAndView updateWriting(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String wriTitle = request.getParameter("wri_title");
		String userNo = request.getParameter("user_no");
		String wriContent = request.getParameter("wri_content");
		
		Writing writing = new Writing(0, wriTitle, null, Integer.parseInt(userNo));
		WriList wriList = new WriList(0, 0, 0, wriContent);
		writing.getWriList().add(wriList);
		
		service.insertWriting(writing);
		
		return new ModelAndView("index.html", true);
	}
	
	
	/**
	 * �� ����
	 */
	public ModelAndView deleteWriting(HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("WritingController�� deleteWriting() �޼ҵ�");
		String wriNo = request.getParameter("wri_no");
		System.out.println("wriNo: " + wriNo);
		
		service.deleteWriting(Integer.parseInt(wriNo));
		
		return new ModelAndView("index.html", true);
	}
	
	
	/**
	 * �� ��ȸ 
	 */
	public ModelAndView selectWriting(HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("WritingController�� selectWriting()�޼ҵ�");
		List<Writing> list = service.selectWriting();
		System.out.println("list: " + list);
		request.setAttribute("list", list);
		return new ModelAndView("index.html", false);
	}
}
