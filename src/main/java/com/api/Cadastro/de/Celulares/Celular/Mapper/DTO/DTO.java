package com.api.Cadastro.de.Celulares.Celular.Mapper.DTO;

import com.api.Cadastro.de.Celulares.Celular.ChipModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTO {
    private Long id;
    private String name;
    private String model;
    private String cor;
    private String img;
    private int price;
    private ChipModel chip;
}
