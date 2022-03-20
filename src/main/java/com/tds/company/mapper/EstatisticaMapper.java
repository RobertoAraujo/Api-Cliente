package com.tds.company.mapper;

import com.tds.company.domain.EstatisticaEntity;
import com.tds.company.dto.EstatisticaDTO;

import java.util.List;
import java.util.stream.Collectors;

public class EstatisticaMapper {
    public static EstatisticaEntity toEntity(EstatisticaDTO dto){
        return merge(new EstatisticaEntity(), dto);
    }
    private static EstatisticaEntity merge(EstatisticaEntity entity, EstatisticaDTO dto){
        entity.setUrlEncurtada(dto.getUrlEncurtada());
        entity.setAcessos(0L);
        return entity;
    }

    public static EstatisticaDTO toDTO(EstatisticaEntity entity){
        return merge(new EstatisticaDTO(), entity);
    }
    private static EstatisticaDTO merge(EstatisticaDTO dto,EstatisticaEntity entity){
        dto.setAcessos(entity.getAcessos());
        dto.setUrlEncurtada(entity.getUrlEncurtada());
        return dto;
    }

    public static List<EstatisticaDTO> toDtoList(List<EstatisticaEntity> entityList){
        return entityList.stream().map(EstatisticaMapper::toDTO).collect(Collectors.toList());
    }
}
