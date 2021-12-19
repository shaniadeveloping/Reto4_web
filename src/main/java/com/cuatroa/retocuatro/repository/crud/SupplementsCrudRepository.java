/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuatroa.retocuatro.repository.crud;

import com.cuatroa.retocuatro.model.Supplements;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author shania vargas
 */
public interface SupplementsCrudRepository extends MongoRepository<Supplements, String> {

    public List<Supplements> findByPriceLessThanEqual(double precio);
    //Reto 5

    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Supplements> findByDescriptionLike(String description);
}
