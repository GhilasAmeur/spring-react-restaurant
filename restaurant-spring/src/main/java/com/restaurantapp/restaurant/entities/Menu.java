package com.restaurantapp.restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double prix;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String imageUrl;
    @OneToMany(mappedBy = "menu",cascade = CascadeType.ALL)
    private List<Bowl> bowls;
    @OneToMany(mappedBy = "menu",cascade = CascadeType.ALL)
    private List<Wrap> wraps;
    @OneToMany(mappedBy = "menu",cascade = CascadeType.ALL)
    private List<Boisson> boissons;
    @OneToMany(mappedBy = "menu",cascade = CascadeType.ALL)
    private List<Dessert> desserts;
    @OneToMany(mappedBy = "menu",cascade = CascadeType.ALL)
    private List<Tacos> tacos;
    @ManyToOne
    @JoinColumn(name ="restaurant_id")
    private Restaurant restaurant;

}
