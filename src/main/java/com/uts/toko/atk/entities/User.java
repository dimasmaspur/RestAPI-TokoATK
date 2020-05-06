/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author G
 */

@Entity
@Table(name="tabel_user_26340311")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_26340311")
    private Long id_26340311;
    
    @Column(name = "nama_26340311", length=50,nullable=false)
    private String nama_26340311;
    
    @Column(name = "email_26340311", length=50,nullable=false, unique=true)
    private String email_26340311;
    
    @Column(name = "alamat_26340311", length=50,nullable=false)
    private String alamat_26340311;
    
    
    
    @Column(name = "telpon_26340311", length=20,nullable=false)
    private String telpon_26340311;

    @OneToMany(mappedBy="user")
    private List<Order> orders_26340311;
    

    
    public User(){
        
    }
    
    public User(Long id_26340311, String nama_26340311, String email_26340311, String alamat_26340311, String telpon_26340311) {
        this.id_26340311 = id_26340311;
        this.nama_26340311 = nama_26340311;
        this.email_26340311 = email_26340311;
        this.alamat_26340311 = alamat_26340311;
        this.telpon_26340311 = telpon_26340311;
    }

    public Long getId_26340311() {
        return id_26340311;
    }

    public void setId_26340311(Long id_26340311) {
        this.id_26340311 = id_26340311;
    }

    public String getNama_26340311() {
        return nama_26340311;
    }

    public void setNama_26340311(String nama_26340311) {
        this.nama_26340311 = nama_26340311;
    }

    public String getEmail_26340311() {
        return email_26340311;
    }

    public void setEmail_26340311(String email_26340311) {
        this.email_26340311 = email_26340311;
    }

    public String getAlamat_26340311() {
        return alamat_26340311;
    }

    public void setAlamat_26340311(String alamat_26340311) {
        this.alamat_26340311 = alamat_26340311;
    }

    public String getTelpon_26340311() {
        return telpon_26340311;
    }

    public void setTelpon_26340311(String telpon_26340311) {
        this.telpon_26340311 = telpon_26340311;
    }

    public List<Order> getOrders_26340311() {
        return orders_26340311;
    }

    public void setOrders_26340311(List<Order> orders_26340311) {
        this.orders_26340311 = orders_26340311;
    }
    
    

    @Override
    public String toString() {
        return "User{" + "id_26340311=" + id_26340311 + ", nama_26340311=" + nama_26340311 + ", email_26340311=" + email_26340311 + ", alamat_26340311=" + alamat_26340311 + ", telpon_26340311=" + telpon_26340311 + '}';
    }
    
    
    
}
