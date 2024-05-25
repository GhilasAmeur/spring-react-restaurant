package com.restaurantapp.restaurant.services;

import com.restaurantapp.restaurant.entities.Boisson;
import com.restaurantapp.restaurant.exceptions.BoissonNotFoundException;
import com.restaurantapp.restaurant.repositories.BoissonRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BoissonServiceImpl implements BoissonService{
    private BoissonRepository boissonRepository;
    @Override
    public Page<Boisson> getAllBoissons(int page, int size) {
        Pageable pageable= PageRequest.of(page,size);
        return boissonRepository.findAll(pageable);
    }

    @Override

    public Boisson getBoissonById(Long id) {

        return boissonRepository.findById(id).orElseThrow(()->new BoissonNotFoundException("Boisson n'exsite pas"));
    }

    @Override
    public Boisson addBoisson(Boisson boisson) {
        return boissonRepository.save(boisson);
    }

    @Override
    public Boisson updateBoisson(Boisson boisson, Long id) {
      Boisson boissonDansBdd= getBoissonById(id);

        boissonDansBdd.setDescription(boisson.getDescription());
        boissonDansBdd.setImageUrl(boisson.getImageUrl());
        boissonDansBdd.setNom(boisson.getNom());
        boissonDansBdd.setPrix(boisson.getPrix());

        return   boissonRepository.save(boissonDansBdd);
    }

    @Override
    public void deleteBoisson(Long id) {
    Boisson boisson=boissonRepository.findById(id).orElseThrow(()->
            new BoissonNotFoundException("Boisson existe pas"));

    boissonRepository.delete(boisson);
    }
}
