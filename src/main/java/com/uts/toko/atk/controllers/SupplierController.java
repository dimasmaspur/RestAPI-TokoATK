/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.controllers;

import com.uts.toko.atk.entities.Supplier;
import com.uts.toko.atk.exceptions.SupplierNotFoundException;
import com.uts.toko.atk.services.SupplierService;
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
@RequestMapping(value="/toko-atk/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    
    @GetMapping
    public List<Supplier> getAllSupplier(){
        return supplierService.getAllSupplier();
    }
    
//    buat user
    
    @PostMapping
    public Supplier createSupplier(@RequestBody Supplier supplier){
        return supplierService.createSupplier(supplier);
    }
    
//    ambil user berdasarkan id
    @GetMapping("/{id_26340311}")
    public Optional<Supplier> getSupplierById(@PathVariable("id_26340311") Long id_26340311){
        
        try{
            return supplierService.getSupplierById(id_26340311);
        }catch(SupplierNotFoundException ex){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
            
        }
        
    }
    
//    update data
    @PutMapping("/{id_26340311}")
    public Supplier updateSupplierById(@PathVariable("id_26340311") Long id_26340311,@RequestBody Supplier supplier){
        
        try{
            
            return supplierService.updateSupplierById(id_26340311, supplier);
        }catch(SupplierNotFoundException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        
    }
//    delete
    @DeleteMapping("/{id_26340311}")
    public void deleteSupplierById(@PathVariable("id_26340311") Long id_26340311){
        supplierService.deleteSupplierById(id_26340311);
    }
}
