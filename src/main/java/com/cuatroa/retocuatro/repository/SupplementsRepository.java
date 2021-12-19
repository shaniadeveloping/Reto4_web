package com.cuatroa.retocuatro.repository;

import com.cuatroa.retocuatro.model.Supplements;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retocuatro.repository.crud.SupplementsCrudRepository;

/**
 *
 * @author shania vargas
 */
@Repository
public class SupplementsRepository {

    @Autowired
    private SupplementsCrudRepository repository;

    public List<Supplements> getAll() {
        return repository.findAll();
    }

    public Optional<Supplements> getSupplement(String reference) {
        return repository.findById(reference);
    }

    public Supplements create(Supplements Supplement) {
        return repository.save(Supplement);
    }

    public void update(Supplements Supplement) {
        repository.save(Supplement);
    }

    public void delete(Supplements Supplement) {
        repository.delete(Supplement);
    }

    public List<Supplements> productByPrice(double precio) {
        return repository.findByPriceLessThanEqual(precio);
    }

    //Reto 5
    public List<Supplements> findByDescriptionLike(String description) {
        return repository.findByDescriptionLike(description);
    }
}
