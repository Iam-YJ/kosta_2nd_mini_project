package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ModelAndView;
import model.dto.Melon;
import model.service.WritingService;

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
	
	

}
