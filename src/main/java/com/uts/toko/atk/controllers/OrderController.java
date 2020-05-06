/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.controllers;

import com.uts.toko.atk.entities.Order;
import com.uts.toko.atk.entities.User;
import com.uts.toko.atk.exceptions.UserNotFoundException;
import com.uts.toko.atk.repository.OrderRepository;
import com.uts.toko.atk.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
public class OrderController {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private OrderRepository orderRepository;
    
    
    @GetMapping("/toko-atk/orders")
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    
//    get all orders berdasarkan user id
    @GetMapping("/toko-atk/users/{userid}/orders")
    public List<Order> getAllOrders(@PathVariable Long userid) throws UserNotFoundException{
        
        Optional<User> userOptional = userRepository.findById(userid);
        if(!userOptional.isPresent())
            throw new UserNotFoundException("User tidak memiliki pesanan");
        
        return userOptional.get().getOrders_26340311();
    }
    
    
//    membuat order
    @PostMapping("/toko-atk/users/{userid}/orders")
    public Order createOrder(@PathVariable Long userid, @RequestBody Order order) throws UserNotFoundException{
        Optional<User> userOptional = userRepository.findById(userid);
//        if(!userOptional.isPresent())
//            throw new UserNotFoundException("User tidak memiliki pesanan");
        
        User user = userOptional.get();
        order.setUser(user);
        return orderRepository.save(order);
    }
    
    
//    untuk menampilkan data order berdasarkan id
    @GetMapping("/toko-atk/orders/{id_26340311}")
    public Optional<Order> getOrderById(@PathVariable("id_26340311") Long id_26340311){
       Optional<Order> order = orderRepository.findById(id_26340311);
        
        if(!order.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }
        return order;
        
    }
    
    @PutMapping("/toko-atk/orders/{id_26340311}")
    public Order updateOrderById(@PathVariable("id_26340311") Long id_26340311,@RequestBody Order order){
        
       Optional<Order> optionalOrder = orderRepository.findById(id_26340311);
        
        if(!optionalOrder.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
        order.setOrderid_26340311(id_26340311);
        return orderRepository.save(order);
        
    }
    
    @DeleteMapping("/toko-atk/orders/{id_26340311}")
     public void deleteOrderById(@PathVariable("id_26340311") Long id_26340311){
       Optional<Order> optionalOrder = orderRepository.findById(id_26340311);
       orderRepository.deleteById(id_26340311);
    }
    
    
   
}
