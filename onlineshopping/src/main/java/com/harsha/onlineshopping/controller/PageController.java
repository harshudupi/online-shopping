/**
 * 
 */
package com.harsha.onlineshopping.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author swarn_000
 *
 */

@RestController
public class PageController {

	@RequestMapping(value = {"/","/index","/page"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Online Shopping");
		return mv;
	}
	
	@RequestMapping(value ="test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting){
		if(greeting == null){
			greeting = "Hello";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}



}
