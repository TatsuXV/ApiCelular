package com.api.Cadastro.de.Celulares.Celular.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.api.Cadastro.de.Celulares.Celular.ChipModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "serve")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CelularModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "cor")
    private String cor;

    @Column(name = "img")
    private String img;

    @Column(name = "price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "chip")
    @JsonIgnore
    private ChipModel chip;



}
