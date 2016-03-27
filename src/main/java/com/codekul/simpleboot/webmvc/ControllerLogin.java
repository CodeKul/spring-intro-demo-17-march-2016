/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.webmvc;

import com.codekul.simpleboot.domain.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author aniruddha
 */
@Controller
public class ControllerLogin {
    
    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView loginPage(){
        
        ModelAndView mav = new ModelAndView("login");
        
        // /WEB-INF/jsp/login.jsp
        
        User user = new User();
        user.setPassword("android");
        user.setUserName("android");
        mav.addObject("user", user);
                
        return mav;
    }
}
