/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.exceptions;

/**
 *
 * @author G
 */
public class UserNotFoundException extends Exception {
    
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(String message) {
        super(message);
    }
    
    
}
