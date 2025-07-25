package com.api.Cadastro.de.Celulares.Celular.Mapper;


import com.api.Cadastro.de.Celulares.Celular.Mapper.DTO.DTO;
import com.api.Cadastro.de.Celulares.Celular.model.CelularModel;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public CelularModel map(DTO dto){
        CelularModel celularModel = new CelularModel();
        celularModel.setId(dto.getId());
        celularModel.setName(dto.getName());
        celularModel.setImg(dto.getImg());
        celularModel.setModel(dto.getModel());
        celularModel.setPrice(dto.getPrice());
        celularModel.setCor(dto.getCor());
        celularModel.setChip(dto.getChip());
        return celularModel;
    }

    public DTO map(CelularModel celularModel){
        DTO dto = new DTO();
        dto.setId(celularModel.getId());
        dto.setChip(celularModel.getChip());
        dto.setName(celularModel.getName());
        dto.setModel(celularModel.getModel());
        dto.setCor(celularModel.getCor());
        dto.setPrice(celularModel.getPrice());
        dto.setId(celularModel.getId());
        return dto;
    }
}
