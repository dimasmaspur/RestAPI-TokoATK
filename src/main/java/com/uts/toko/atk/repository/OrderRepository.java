/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.repository;

import com.uts.toko.atk.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author G
 */
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
