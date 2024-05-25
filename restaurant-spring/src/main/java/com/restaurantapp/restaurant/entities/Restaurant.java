package com.restaurantapp.restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    private String imageUrl;
    @Temporal(TemporalType.TIME)
    private Date heureOuverture;
    @Temporal(TemporalType.TIME)
    private Date heureFermeture;
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<Menu> menus;


}
