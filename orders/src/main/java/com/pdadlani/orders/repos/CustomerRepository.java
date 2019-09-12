package com.pdadlani.orders.repos;

import com.pdadlani.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByCustname(String name);
}
