package com.tds.company.service;

import com.tds.company.domain.EstatisticaEntity;
import com.tds.company.repository.EstatisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstatisticaService {

    @Autowired
    private EstatisticaRepository repository;

    public EstatisticaEntity salvaEstatistica(EstatisticaEntity entity) {
        return repository.save(entity);
    }

    public List<EstatisticaEntity> buscaEstatisticaList() {
        Pageable pePageable = PageRequest.of(0, 10, Sort.by("acessos").descending());
        Page<EstatisticaEntity> content = repository.findAll(pePageable);
        return content.getContent();
    }
    public EstatisticaEntity buscarPorUrlEncurtada(String urlEncurtada){
        return repository.findAllByUrlEncurtada(urlEncurtada).orElseThrow();
    }
}
