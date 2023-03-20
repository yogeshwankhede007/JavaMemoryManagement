package com.escapingReferences;

import com.jvmAndMemoryManagement.Address;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DemoEscapingProducts {
    public static Order createOrder(User user, List<Product> products){
        return new Order(LocalDate.now(),products,user);
    }

    public static void processProducts(List<String> products){
        for (String product : products)
        {
            System.out.println(product);
        }
    }

    public static void sendOrder(Order order){
        System.out.println("sending order....\n");
        System.out.println("Date "+order.getOrderDate());
        System.out.println("User "+order.getUser().getName());
        System.out.println("Products");
//        for (Product p: order.getProducts()) {
//            System.out.println("- " + p.getName());
//        }
    }

    public static void main(String[] args) {
        //create a user
        SensetiveObject so = new SensetiveObject();
        so.setSecretCode(12345);
        User user = new User("Yogesh", new Address(), new SensetiveObject());

        //create a product list
        List<Product> products = new ArrayList<>();
        products.add(new Product("java","book",671));

        //create an order
        Order o = new Order(LocalDate.now(),products,user);
        //Order o = createOrder(user,products);

        //process products original list
        System.out.println("---original---");
        processProducts((List<String>) o.getProducts());

        //process products copy list
        List<String> copy = (List<String>) o.getProducts();
        System.out.println("---Copy list---");
        processProducts(copy);
    }
}
