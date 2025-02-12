package com.springheaven.functional.day_1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer praveenRaj = new Customer("PraveenRaj", "497354080");
        greetCustomer(praveenRaj);

        //this implementation using the functional interface
        greetCustomer.accept(praveenRaj);
        greetCustomerV2.accept(praveenRaj,true);


    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello"+customer.getCustomerName() +
                ", thanks for registering phone Number "
                + customer.getCustomerPhoneNumber());
    }

    static Consumer<Customer>  greetCustomer = (customer) -> {
        System.out.println("Hello"+customer.getCustomerName() +
                ", thanks for registering phone Number "
                + customer.getCustomerPhoneNumber());
    };


    static BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showPhoneNumber) -> {
        System.out.println("hello"+customer.getCustomerName() + (showPhoneNumber ? customer.getCustomerPhoneNumber() : ""));
};


    //Below is the implementation without using consumer Functional Interface
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName,String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }
    }
}
