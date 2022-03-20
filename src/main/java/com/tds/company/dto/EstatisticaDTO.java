package com.tds.company.dto;

import java.io.Serializable;
import java.util.Objects;

public class EstatisticaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String urlEncurtada;
    private Long acessos;

    public EstatisticaDTO() {
    }

    public String getUrlEncurtada() {
        return urlEncurtada;
    }

    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }

    public Long getAcessos() {
        return acessos;
    }

    public void setAcessos(Long acessos) {
        this.acessos = acessos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstatisticaDTO that = (EstatisticaDTO) o;
        return Objects.equals(urlEncurtada, that.urlEncurtada) && Objects.equals(acessos, that.acessos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlEncurtada, acessos);
    }
}
