package controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dto.Melon;
import model.service.MelonService;

@WebServlet("/melon")
public class MelonController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {

		return null;
	}

	public ModelAndView selectByGrade(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ���� ȣ�� -> dao ȣ���ؼ� �װ�� �޾Ƽ� �̵�
		List<Melon> list = MelonService.selectByGrade();
		request.setAttribute("list", list);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("");

		return mv;
	}

	public ModelAndView selectByHits(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ���� ȣ�� -> dao ȣ���ؼ� �װ�� �޾Ƽ� �̵�
		List<Melon> list = MelonService.selectByHits();
		request.setAttribute("list", list);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("");

		return mv;
	}

	public ModelAndView selectByType(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ���� ȣ�� -> dao ȣ���ؼ� �װ�� �޾Ƽ� �̵�

		String type = request.getParameter("type");
		List<Melon> list = MelonService.selectByType(type);
		request.setAttribute("list", list);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("");

		return mv;
	}

	public ModelAndView updateHits(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ���� ȣ�� -> dao ȣ���ؼ� �װ�� �޾Ƽ� �̵�

		String resNo = request.getParameter("resNo");
		int result = MelonService.updateHits(Integer.parseInt(resNo));

		ModelAndView mv = new ModelAndView();
		mv.setRedirect(true);
		mv.setViewName("");

		return mv;
	}

	public ModelAndView selectByArea(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ���� ȣ�� -> dao ȣ���ؼ� �װ�� �޾Ƽ� �̵�
		System.out.println("MelonoController�� selectByArea Controller ��û");

//		String area = request.getParameter("area");
		List<Melon> list = MelonService.selectByArea("����");

		ModelAndView mv = new ModelAndView();

		request.setAttribute("res", list);
		
		for(Melon m : list) {
			System.out.println(m);
		}
		
		mv.setViewName("/html/admin_section/deleteResaturant.jsp");

		return mv;

	}

	public ModelAndView selectByResName(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ���� ȣ�� -> dao ȣ���ؼ� �װ�� �޾Ƽ� �̵�

		String resName = request.getParameter("resName");
		List<Melon> list = MelonService.selectByResName(resName);
		request.setAttribute("list", list);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("");

		return mv;
	}

	public ModelAndView selectByPrice(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ���� ȣ�� -> dao ȣ���ؼ� �װ�� �޾Ƽ� �̵�

		String price = request.getParameter("price");
		List<Melon> list = MelonService.selectByResName(price);
		request.setAttribute("list", list);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("");

		return mv;
	}
}
