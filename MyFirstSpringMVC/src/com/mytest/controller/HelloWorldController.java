package com.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloWorldController {

	/**                                                           
	 * 描述 : 我的第一个SpringMVC环境搭建. <br> 
	 *<p>                                                  
	                                                                                                                                                                                                      
	 * @param args                                                                                                   
	 */
	@RequestMapping("/helloworld")
	public String helloWorld(Model model){
		model.addAttribute("message","我的第一个SpringMVC环境搭建成功!");
		return "helloworld";
	}

}
