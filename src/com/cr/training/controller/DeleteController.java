package com.cr.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cr.training.model.Login;
import com.cr.training.model.User;
import com.cr.training.service.UserService;

@Controller
public class DeleteController {

	
	 @Autowired
	  public UserService userService;


	  @RequestMapping(value = "/delete", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("delete");
	    mav.addObject("login", new Login());

	    return mav;
	  }

	  @RequestMapping(value = "/delete", method = RequestMethod.POST)
	  public ModelAndView delete(HttpServletRequest request, HttpServletResponse response,
	      @ModelAttribute("login") Login login) {

	    userService.delete(login.getUsername());

	    return new ModelAndView("deleteresult", "username", login.getUsername());
	    // name of the page to be diplayed, key, value
	  }
}
