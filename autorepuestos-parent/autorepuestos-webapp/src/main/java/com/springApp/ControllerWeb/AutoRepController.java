/**
 * 
 */
package com.springApp.ControllerWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modelo.Repuesto;


/**
 * @author Gaston Maron
 *
 */
@Controller
public class AutoRepController  { 

	String message = "Primeras pruebas: ";
	

	public String index() {
	    return "index";
	}
	
	@RequestMapping("/")
	public ModelAndView showMessageIndex(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
		
		Repuesto rep = new Repuesto();
		rep.setAuto(1);
		rep.setDescripcion("Algo");
		rep.setModelo(1992);
		rep.setCodigo(0001);
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("repuesto", rep);
		mv.addObject(rep);
		mv.addObject("mensaje","hola");
		
		return mv;
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
