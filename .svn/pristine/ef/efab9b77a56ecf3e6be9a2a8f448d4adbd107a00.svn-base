package cellivery.front.controller;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cellivery.front.model.FrontDAO;


@Controller
@RequestMapping("/*")
public class FrontController {
	
	@Autowired
	private FrontDAO front_dao;
	
	@RequestMapping("/admin")
	public ModelAndView admin_index(HttpServletRequest request) throws MalformedURLException, IOException {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/admin/index");
		return mav;
	}
	
	@RequestMapping("/")
	public ModelAndView front_index(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/index");
		
		front_dao.test();
		
		return mav;
	}
	
	@RequestMapping("/about")
	public ModelAndView sub_about(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/about");
		
		
		return mav;
	}
	
	@RequestMapping("/brand")
	public ModelAndView sub_brand(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/brand");
		
		
		return mav;
	}
	
	@RequestMapping("/brand_bioneul")
	public ModelAndView sub_brand_bioneul(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/brand_bioneul");
		
		
		return mav;
	}
	@RequestMapping("/brand_therapuez")
	public ModelAndView sub_brand_therapuez(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/brand_therapuez");
		
		
		return mav;
	}
	
	@RequestMapping("/business")
	public ModelAndView sub_business(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/business");
		
		
		return mav;
	}
	
	@RequestMapping("/livingHealth")
	public ModelAndView sub_living(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/living");
		
		
		return mav;
	}
	
	@RequestMapping("/biocareTissue")
	public ModelAndView sub_bio(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/bio");
		
		
		return mav;
	}
	
	@RequestMapping("/odm")
	public ModelAndView sub_odm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/odm");
		
		
		return mav;
	}
	
	@RequestMapping("/rnd")
	public ModelAndView sub_rnd(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/rnd");
		
		
		return mav;
	}
	
	@RequestMapping("/news")
	public ModelAndView sub_pr(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/pr");
		
		
		return mav;
	}
	
	@RequestMapping("/board_view")
	public ModelAndView sub_board_view(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/board_view");
		
		
		return mav;
	}
	
	@RequestMapping("/notice")
	public ModelAndView sub_notice(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/notice");
		
		
		return mav;
	}
	
	@RequestMapping("/media")
	public ModelAndView sub_media(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/media");
		
		
		return mav;
	}
	
	@RequestMapping("/sns")
	public ModelAndView sub_sns(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/sns");
		
		
		return mav;
	}
	
	@RequestMapping("/career")
	public ModelAndView sub_career(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/career");
		
		
		return mav;
	}
	
	@RequestMapping("/career1")
	public ModelAndView sub_career1(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/front/career1");
		
		
		return mav;
	}
}
