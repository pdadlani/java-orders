package com.pdadlani.orders.services;

import com.pdadlani.orders.models.Customer;

import java.util.List;

public interface CustomerService {

    // return all customers with their orders
    List<Customer> findAll();

    // R
    // return all orders for a particular customer based on name
    Customer findCustomerByName(String name);

    // C
    // add a new customer including any new orders
    Customer save(Customer customer);

    // U
    // update the customer based off of custcode
    // does not have to do anything with orders!
    Customer update(Customer customer, long id);

    // D
    // delete the customer based off of custcode
    // should also delete the orders of that customer
    void delete(long id);
}