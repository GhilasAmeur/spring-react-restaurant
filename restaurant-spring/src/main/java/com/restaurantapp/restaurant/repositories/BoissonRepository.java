package com.restaurantapp.restaurant.repositories;

import com.restaurantapp.restaurant.entities.Boisson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoissonRepository extends JpaRepository<Boisson,Long> {
}
