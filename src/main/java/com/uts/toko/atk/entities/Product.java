/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author G
 */

@Entity
@Table(name ="tabel_product_26340311")
public class Product {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productid_26340311")
    private Long productid_26340311;
    
    @Column(name = "nama_product_26340311", length=50,nullable=false)
    private String nama_product_26340311;
  
    @Column(name = "kategori_26340311")
    private String kategori_26340311;
    
    @Column(name = "stok_26340311")
    private String stok_26340311;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Supplier supplier;
    
    public Product(){
        super();
    }

    public Long getProductid_26340311() {
        return productid_26340311;
    }

    public void setProductid_26340311(Long productid_26340311) {
        this.productid_26340311 = productid_26340311;
    }

    public String getNama_product_26340311() {
        return nama_product_26340311;
    }

    public void setNama_product_26340311(String nama_product_26340311) {
        this.nama_product_26340311 = nama_product_26340311;
    }

    public String getKategori_26340311() {
        return kategori_26340311;
    }

    public void setKategori_26340311(String kategori_26340311) {
        this.kategori_26340311 = kategori_26340311;
    }

    public String getStok_26340311() {
        return stok_26340311;
    }

    public void setStok_26340311(String stok_26340311) {
        this.stok_26340311 = stok_26340311;
    }

  

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }


    
    
    
}
