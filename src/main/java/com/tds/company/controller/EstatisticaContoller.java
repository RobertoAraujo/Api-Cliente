package com.tds.company.controller;

import com.tds.company.domain.EstatisticaEntity;
import com.tds.company.dto.EstatisticaDTO;
import com.tds.company.mapper.EstatisticaMapper;
import com.tds.company.service.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/estatistica")
public class EstatisticaContoller {

    @Autowired
    private EstatisticaService service;

    @GetMapping(value = "/")
    public ResponseEntity<List<EstatisticaDTO>> getEstatistica() {
        List<EstatisticaEntity> estatisticaEntities = service.buscaEstatisticaList();
        return ResponseEntity.ok(EstatisticaMapper.toDtoList(estatisticaEntities));
    }


}
