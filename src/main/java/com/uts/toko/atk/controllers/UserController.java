/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.controllers;

import com.uts.toko.atk.entities.User;
import com.uts.toko.atk.exceptions.UserNotFoundException;
import com.uts.toko.atk.services.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author G
 */

@RestController
@Validated
@RequestMapping(value="/toko-atk/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
//    cari semua user
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
//    buat user
    
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    
//    ambil user berdasarkan id
    @GetMapping("/{id_26340311}")
    public Optional<User> getUserById(@PathVariable("id_26340311") Long id_26340311){
        
        try{
            return userService.getUserById(id_26340311);
        }catch(UserNotFoundException ex){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
            
        }
        
    }
    
//    update data
    @PutMapping("/{id_26340311}")
    public User updateUserById(@PathVariable("id_26340311") Long id_26340311,@RequestBody User user){
        
        try{
            
            return userService.updateUserById(id_26340311, user);
        }catch(UserNotFoundException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        
    }
//    delete
    @DeleteMapping("/{id_26340311}")
    public void deleteUserById(@PathVariable("id_26340311") Long id_26340311){
        userService.deleteUserById(id_26340311);
    }
}
