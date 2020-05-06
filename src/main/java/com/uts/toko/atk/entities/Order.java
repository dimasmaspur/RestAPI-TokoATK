                            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.toko.atk.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.Fetch;

/**
 *
 * @author G
 */
@Entity
@Table(name = "tabel_order_26340311")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderid_26340311;
    private String nama_barang_26340311;
    private String jumlah_26340311;
    
    @ManyToOne(fetch = FetchType.LAZY )
    @JsonIgnore
    private User user;
    
    
    
    public Order(){
        super();
    }

    public Long getOrderid_26340311() {
        return orderid_26340311;
    }

    public void setOrderid_26340311(Long orderid_26340311) {
        this.orderid_26340311 = orderid_26340311;
    }

    public String getNama_barang_26340311() {
        return nama_barang_26340311;
    }

    public void setNama_barang_26340311(String nama_barang_26340311) {
        this.nama_barang_26340311 = nama_barang_26340311;
    }

    public String getJumlah_26340311() {
        return jumlah_26340311;
    }

    public void setJumlah_26340311(String jumlah_26340311) {
        this.jumlah_26340311 = jumlah_26340311;
    }


    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

  
    
    
}
