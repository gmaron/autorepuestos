/**
 * 
 */
package com.springApp.ControllerWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author Gaston Maron
 *
 */
@Controller
public class AutoRepController  { 

	String message = "Primeras pruebas: ";
	
	@RequestMapping("/")
	public String index() {
	    return "index";
	}
	
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	
	

}
