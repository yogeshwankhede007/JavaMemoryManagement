package com.escapingReferences;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Product> products;
    private User user;

    public Order(LocalDate orderDate, List<Product> products, User user){
        this.orderDate = orderDate;
        this.products = new ArrayList<>(products);
        this.user = user;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Product getProducts() {

        //return products;
        //return List.copyOf(products);
       // return Collections.unmodifiableList(products);

        //deep copy
        List<Product> copy = new  ArrayList<>();
        for (Product p : products){
            try {
                copy.add((Product) p.clone());
            }
            catch (CloneNotSupportedException e){
                e.printStackTrace();
            }
        }
        return (Product) copy;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
