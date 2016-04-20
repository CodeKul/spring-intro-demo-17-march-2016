/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.controller;

import com.codekul.simpleboot.domain.User;
import com.codekul.simpleboot.service.ServiceUser;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aniruddha
 */
@RestController
public class ControllerRestServices {

    @Autowired
    private ServiceUser serviceUser;

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public /*@ResponseBody*/ ResponseEntity<User> userInfo() {

        User userBody = new User();
        userBody.setUserName("Android");
        userBody.setPassword("android");

        HttpHeaders headers = new HttpHeaders();

        ResponseEntity<User> entity = new ResponseEntity<>(userBody, headers, HttpStatus.OK);
        return entity;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> loginUser(@RequestBody User user) {

        ResponseEntity<Map<String, Object>> entity = null;
        Map<String, Object> mapBody = new HashMap<>();
        HttpHeaders headers = new HttpHeaders();
        
        try {

            serviceUser.login(user);
            
            mapBody.clear();
            mapBody.put("status", "success");
            mapBody.put("msg", "Logged Successfully ..");
            
            entity = new ResponseEntity<>(mapBody,headers,HttpStatus.OK);
            
        } catch (Exception ex) {
            Logger.getLogger(ControllerRestServices.class.getName()).log(Level.SEVERE, null, ex);
            
            mapBody.clear();
            mapBody.put("status", "fail");
            mapBody.put("msg", "Bad Crediantials ...");
            
            entity = new ResponseEntity<>(mapBody,headers,HttpStatus.BAD_REQUEST);
        }

        return entity;
    }
}
