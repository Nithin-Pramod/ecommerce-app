//package com.ecomapp.ecomapp.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "inventory")
//public class Inventory {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToOne(mappedBy = "inventory")
//    private Product product;
//
//    private int quantity;
//
//    public Inventory() {
//    }
//
//    public Inventory(Long id, Product product, int quantity) {
//        this.id = id;
//        this.product = product;
//        this.quantity = quantity;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "Inventory{" +
//                "id=" + id +
//                ", product=" + product +
//                ", quantity=" + quantity +
//                '}';
//    }
//}
