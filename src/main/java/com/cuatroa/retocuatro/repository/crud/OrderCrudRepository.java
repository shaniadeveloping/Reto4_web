package com.cuatroa.retocuatro.repository.crud;

import com.cuatroa.retocuatro.model.Order;

import java.util.List;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author shania vargas
 */
public interface OrderCrudRepository extends CrudRepository<Order, Integer> {

    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String country);
    
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);
}
