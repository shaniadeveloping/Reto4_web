package com.cuatroa.retocuatro.service;

import com.cuatroa.retocuatro.model.Supplements;
import com.cuatroa.retocuatro.repository.SupplementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author shania vargas
 */
@Service
public class SupplementsService {

    @Autowired
    private SupplementsRepository repository;

    public List<Supplements> getAll() {
        return repository.getAll();
    }

    public Optional<Supplements> getSupplement(String reference) {
        return repository.getSupplement(reference);
    }

    public Supplements create(Supplements supplement) {
        if (supplement.getReference() == null) {
            return supplement;
        } else {
            return repository.create(supplement);
        }
    }

    public Supplements update(Supplements supplement) {

        if (supplement.getReference() != null) {
            Optional<Supplements> supplementDb = repository.getSupplement(supplement.getReference());
            if (!supplementDb.isEmpty()) {
                if (supplement.getBrand() != null) {
                    supplementDb.get().setBrand(supplement.getBrand());
                }

                if (supplement.getCategory() != null) {
                    supplementDb.get().setCategory(supplement.getCategory());
                }

                if (supplement.getPresentation() != null) {
                    supplementDb.get().setPresentation(supplement.getPresentation());
                }

                if (supplement.getDescription() != null) {
                    supplementDb.get().setDescription(supplement.getDescription());
                }
                if (supplement.getPrice() != 0.0) {
                    supplementDb.get().setPrice(supplement.getPrice());
                }
                if (supplement.getQuantity() != 0) {
                    supplementDb.get().setQuantity(supplement.getQuantity());
                }
                if (supplement.getPhotography() != null) {
                    supplementDb.get().setPhotography(supplement.getPhotography());
                }
                supplementDb.get().setAvailability(supplement.isAvailability());
                repository.update(supplementDb.get());
                return supplementDb.get();
            } else {
                return supplement;
            }
        } else {
            return supplement;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getSupplement(reference).map(supplement -> {
            repository.delete(supplement);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    //Reto 5
    public List<Supplements> productByPrice(double price) {
        return repository.productByPrice(price);
    }

    //Reto 5
    public List<Supplements> findByDescriptionLike(String description) {
        return repository.findByDescriptionLike(description);
    }
}
