package com.restaurantapp.restaurant.services;

import com.restaurantapp.restaurant.entities.Boisson;
import org.springframework.data.domain.Page;

public interface BoissonService {
    Page<Boisson> getAllBoissons(int page, int size);

    Boisson getBoissonById(Long id);

    Boisson addBoisson(Boisson boisson);
    Boisson updateBoisson(Boisson boisson,Long id);
    void deleteBoisson(Long id);
}
