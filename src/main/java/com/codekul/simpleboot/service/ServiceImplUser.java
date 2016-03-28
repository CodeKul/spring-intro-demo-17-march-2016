/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.service;

import com.codekul.simpleboot.domain.User;
import com.codekul.simpleboot.repository.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author aniruddha
 */
@Service
public class ServiceImplUser implements ServiceUser{

    @Autowired
    private RepoUser repoUser;
    
    @Override
    public Boolean login(User user) {
        
        return  repoUser.login(user);
    }
}
