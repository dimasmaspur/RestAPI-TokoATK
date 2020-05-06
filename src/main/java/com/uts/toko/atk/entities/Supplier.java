/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author G
 */

@Entity
@Table(name="tabel_supplier__26340311")
public class Supplier {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_26340311")
    private Long id_26340311;
    
    @Column(name="nama_supplier_26340311")
    private String nama_supplier_26340311;
    
    @Column(name="alamat_supplier_26340311")
    private String alamat_supplier_26340311;
    
    @Column(name="telpon_supplier_26340311")
    private String telpon_26340311;
    
    @OneToMany(mappedBy="supplier")
    private List<Product> products_26340311;
    
    
    public Supplier(){
        
    }

    public Supplier(Long id_26340311, String nama_supplier_26340311, String alamat_supplier_26340311, String telpon_26340311) {
        this.id_26340311 = id_26340311;
        this.nama_supplier_26340311 = nama_supplier_26340311;
        this.alamat_supplier_26340311 = alamat_supplier_26340311;
        this.telpon_26340311 = telpon_26340311;
    }

    public Long getId_26340311() {
        return id_26340311;
    }

    public void setId_26340311(Long id_26340311) {
        this.id_26340311 = id_26340311;
    }

    public String getNama_supplier_26340311() {
        return nama_supplier_26340311;
    }

    public void setNama_supplier_26340311(String nama_supplier_26340311) {
        this.nama_supplier_26340311 = nama_supplier_26340311;
    }

    public String getAlamat_supplier_26340311() {
        return alamat_supplier_26340311;
    }

    public void setAlamat_supplier_26340311(String alamat_supplier_26340311) {
        this.alamat_supplier_26340311 = alamat_supplier_26340311;
    }

    public String getTelpon_26340311() {
        return telpon_26340311;
    }

    public void setTelpon_26340311(String telpon_26340311) {
        this.telpon_26340311 = telpon_26340311;
    }

    public List<Product> getProducts_26340311() {
        return products_26340311;
    }

    public void setProducts_26340311(List<Product> products_26340311) {
        this.products_26340311 = products_26340311;
    }
    
    

    @Override
    public String toString() {
        return "Supplier{" + "id_26340311=" + id_26340311 + ", nama_supplier_26340311=" + nama_supplier_26340311 + ", alamat_supplier_26340311=" + alamat_supplier_26340311 + ", telpon_26340311=" + telpon_26340311 + '}';
    }
    
    
    
    
}
