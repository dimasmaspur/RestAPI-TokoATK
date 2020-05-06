/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.services;

import com.uts.toko.atk.entities.User;
import com.uts.toko.atk.exceptions.UserNotFoundException;
import com.uts.toko.atk.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author G
 */
@Service
public class UserService {
    
    
    @Autowired
    private UserRepository userRepository;
    
    public List<User> getAllUsers(){
        
      return  userRepository.findAll();
        
    }
    
    
//    create user
    public User createUser(User user){
        
        return userRepository.save(user);
    }
    
//    get by id
    public Optional<User> getUserById(Long id_26340311) throws UserNotFoundException{
        Optional<User> user = userRepository.findById(id_26340311);
        
        if(!user.isPresent()){
            throw new UserNotFoundException("User tidak ada!");
        }
        return user;
    }
    
//    ini script untuk update
    public User updateUserById(Long id_26340311, User user)throws UserNotFoundException{
       
        Optional<User> optionalUser = userRepository.findById(id_26340311);
        
        if(!optionalUser.isPresent()){
            throw new UserNotFoundException("User tidak ada! coba koreksi user id nya");
        }
        
        user.setId_26340311(id_26340311);
        return userRepository.save(user);
    }
    
//    delete
    public void deleteUserById(Long id_26340311){
         Optional<User> optionalUser = userRepository.findById(id_26340311);
        
        if(!optionalUser.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"User tidak ada! coba koreksi user id nya");
        }
        userRepository.deleteById(id_26340311);
        
    }
    
}
