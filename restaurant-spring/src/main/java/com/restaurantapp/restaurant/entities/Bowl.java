package com.restaurantapp.restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "bowl")
public class Bowl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Column(columnDefinition = "TEXT")
    private String description;
    private double prix;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

}
