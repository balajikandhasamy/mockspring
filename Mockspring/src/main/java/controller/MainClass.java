package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import dao.Idfcmock;
import dto.Mockdto;


@Controller
public class MainClass {
	@RequestMapping("/insert")
	public ModelAndView create() {
		ModelAndView modelAndView = new ModelAndView("insert.jsp");
		Mockdto op=new Mockdto();
		modelAndView.addObject("key", op);
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("/create")
	public void insert(Mockdto mockdto ) {

		Idfcmock idfcmock=new Idfcmock();
		 idfcmock.insert(mockdto);
	}
	 @RequestMapping("/fetch1")
	   	public ModelAndView fetch() {
	   		ModelAndView mav2 = new ModelAndView("fetch1.jsp");
	   		Mockdto o=new Mockdto();
	   		mav2.addObject("key1",o);
	   		return mav2;
	       }
	       @ResponseBody
	      	@RequestMapping("/fetch")
	      	public ModelAndView fetch(int id){
	    	   Idfcmock idfcmock=new Idfcmock();
	    	   Mockdto o1=idfcmock.fetch(id);
	      		ModelAndView mav1 = new ModelAndView("fetch2.jsp");
	   		mav1.addObject("key1",o1);
	   		return mav1;
	       }
}
