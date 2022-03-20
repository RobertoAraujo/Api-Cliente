package com.tds.company.controller;

import com.tds.company.client.UrlClient;
import com.tds.company.domain.EstatisticaEntity;
import com.tds.company.dto.EstatisticaDTO;
import com.tds.company.dto.UrlDTO;
import com.tds.company.dto.UrlRequest;
import com.tds.company.mapper.EstatisticaMapper;
import com.tds.company.service.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/url")
public class UrlController {

    @Autowired
    private UrlClient urlClient;

    @Autowired
    private EstatisticaService service;

    @PostMapping(value = "/criar")
    public ResponseEntity<String> criarUrlEncurtada(@RequestBody UrlRequest urlRequest){
        UrlDTO urlDTO = urlClient.createUrl(new UrlDTO(urlRequest.getUrl()));
        EstatisticaEntity estatisticaEntity = new EstatisticaEntity(urlDTO.getUrl());
        service.salvaEstatistica(estatisticaEntity);
        return ResponseEntity.ok(urlDTO.getUrl());
    }

    @GetMapping(value = "/buscar")
    public ResponseEntity<UrlDTO> getUrl(@RequestBody UrlDTO urlDTO){
        UrlDTO response = urlClient.getUrlDTO(urlDTO);
        EstatisticaEntity estatisticaEntity = service.buscarPorUrlEncurtada(urlDTO.getUrl());
        estatisticaEntity.setAcessos(estatisticaEntity.getAcessos()+1);
        service.salvaEstatistica(estatisticaEntity);
        return ResponseEntity.ok(response);
    }

}
