package com.restaurantapp.restaurant.controllers;

import com.restaurantapp.restaurant.entities.Boisson;
import com.restaurantapp.restaurant.services.BoissonService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@RestController
@RequestMapping(path = "boisson")
public class BoissonController {
    private BoissonService boissonService;
    @GetMapping(path = "/boissons")
    public ResponseEntity<Page<Boisson>> getAllBoissons(
            @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Page pageBoisson=boissonService.getAllBoissons(page,size);
    return ResponseEntity.ok().body(pageBoisson);
    }
    @GetMapping(path = "{id}")
    public ResponseEntity<Boisson> getboissonById(@PathVariable Long id){
        Boisson boissonId=boissonService.getBoissonById(id);
        return ResponseEntity.ok().body(boissonId);
    }
    @PostMapping(path = "ajouter")
    public ResponseEntity<Boisson> addBoisson(@RequestBody Boisson boisson){
        Boisson nouvelleBoisson = boissonService.addBoisson(boisson);
        return ResponseEntity.ok().body(nouvelleBoisson);
    }
    @PutMapping(path="{id}")
    public ResponseEntity<Boisson> updateBoisoon(@PathVariable Long id, @RequestBody Boisson boisson){
        Boisson boissonUpdate=boissonService.updateBoisson(boisson,id);
       return ResponseEntity.ok().body(boissonUpdate);

    }
    @DeleteMapping(path = "{id}")
    public void  deleteBoisson(@PathVariable Long id){
       boissonService.deleteBoisson(id);
    }

}
