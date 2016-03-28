/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.service;

import com.codekul.simpleboot.domain.User;

/**
 *
 * @author aniruddha
 */
public interface ServiceUser {
    
    Boolean login(User user);
}
