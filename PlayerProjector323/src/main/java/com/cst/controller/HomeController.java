package com.cst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/**
	 * Shows Home Page
	 * @return "index" (home-page)
	 */
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    /**
     * Shows Logged In Message
     * @return index - home page
     */
    @GetMapping("/loggedIn")
    public String loggedIn() {
    	return "index";
    }
    
    /**
     * Shows test page
     * @return trial - test only
     */
    @RequestMapping("/trial")
    public String tryMe() {
    	return "trial";
    }
	
}
