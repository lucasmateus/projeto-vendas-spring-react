package com.projetospringreact.vendasspring.dto;

import com.projetospringreact.vendasspring.entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {
    private static final long seialVersionUID = 1L;

    private String sellerName;
    private Double sum;

    public SaleSumDTO(){

    }

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sallerName) {
        this.sellerName = sallerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
