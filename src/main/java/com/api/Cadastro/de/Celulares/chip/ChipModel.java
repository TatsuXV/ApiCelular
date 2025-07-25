package com.api.Cadastro.de.Celulares.chip;

import com.api.Cadastro.de.Celulares.Celular.model.CelularModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChipModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "operadora")
    private String operadora;

    @Column(name = "number")
    private int number;

    @OneToMany(mappedBy = "chip")
    private List<CelularModel> celular;
}
