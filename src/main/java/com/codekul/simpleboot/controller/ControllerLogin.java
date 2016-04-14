/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.controller;

import com.codekul.simpleboot.domain.User;
import com.codekul.simpleboot.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author aniruddha
 */
@Controller
public class ControllerLogin {

    @Autowired
    private ServiceUser serviceUser;
    
    @RequestMapping(value = {"/","/index"}, method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView loadIndex(){
        
        ModelAndView mav = new ModelAndView("index");
        
        return mav;
    }
    
     @RequestMapping(value = "/error", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView loadError(){
        
        ModelAndView mav = new ModelAndView("fail");
        
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView loginPage(@RequestParam String userName, @RequestParam String password) throws Exception {

        System.out.println("User Name - >" +userName +" Password -> "+password);
        
        User user = new User();
        user.setPassword(userName);
        user.setUserName(password);

        ModelAndView mav = null;
        
        if (serviceUser.login(user)) {

            mav = new ModelAndView("login");
            mav.addObject("user", user);
            // /WEB-INF/jsp/login.jsp
            
        } else {

            System.out.println("In Else ... ");
            mav = new ModelAndView("fail");
            mav.addObject("user", user);
        }

        return mav;
    }
}
