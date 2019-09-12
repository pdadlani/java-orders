package com.pdadlani.orders.repos;

import com.pdadlani.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
