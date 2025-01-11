package com.ascodev.tacos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
   @Size(min = 5, message = "")
    private String name;

    @NotNull
    @Size(min = 1,  message = "")
    @ManyToMany
    private List<Ingredient> ingredients = new ArrayList<>();

    private Date createdAt = new Date();

}
