/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.controllers;

import com.uts.toko.atk.entities.Order;
import com.uts.toko.atk.entities.Product;
import com.uts.toko.atk.entities.Supplier;
import com.uts.toko.atk.exceptions.SupplierNotFoundException;
import com.uts.toko.atk.repository.ProductRepository;
import com.uts.toko.atk.repository.SupplierRepository;
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
public class ProductController {
    @Autowired
    private SupplierRepository supplierRepository;
    
    @Autowired
    private ProductRepository productRepository;
    
    
    @GetMapping("/toko-atk/products")
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    
//    get all orders berdasarkan id suplier
    @GetMapping("toko-atk/supplier/{supplierid}/products")
    public List<Product> getAllproducts(@PathVariable Long supplierid) throws SupplierNotFoundException{
        
        Optional<Supplier> supplierOptional = supplierRepository.findById(supplierid);
        if(!supplierOptional.isPresent())
            throw new SupplierNotFoundException("Tidak ada data");
        
        return supplierOptional.get().getProducts_26340311();
    }
    
    
//    membuat order
    @PostMapping("/toko-atk/supplier/{supplierid}/products")
    public Product createProduct(@PathVariable Long supplierid, @RequestBody Product product) throws SupplierNotFoundException{
        Optional<Supplier> supplierOptional = supplierRepository.findById(supplierid);
//        if(!supplierOptional.isPresent())
//            throw new SupplierNotFoundException("Tidak ada data");
        
        Supplier supplier = supplierOptional.get();
        product.setSupplier(supplier);
        return productRepository.save(product);
    }
    
     @GetMapping("/toko-atk/products/{id_26340311}")
    public Optional<Product> getProductById(@PathVariable("id_26340311") Long id_26340311){
       Optional<Product> product = productRepository.findById(id_26340311);
        
        if(!product.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }
        return product;
        
    }
    
    @PutMapping("/toko-atk/products/{id_26340311}")
    public Product updateProductById(@PathVariable("id_26340311") Long id_26340311,@RequestBody Product product){
        
       Optional<Product> optionalProduct = productRepository.findById(id_26340311);
        
        if(!optionalProduct.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
        product.setProductid_26340311(id_26340311);
        return productRepository.save(product);
        
    }
    
    @DeleteMapping("/toko-atk/products/{id_26340311}")
     public void deleteProductById(@PathVariable("id_26340311") Long id_26340311){
       Optional<Product> optionalProduct = productRepository.findById(id_26340311);
       productRepository.deleteById(id_26340311);
    }
    
}
