package com.tds.company.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table (name = "estatistica")
public class EstatisticaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "url_encurtada")
    private String urlEncurtada;
    @Column (name = "acessos")
    private Long acessos;

    public EstatisticaEntity() {
    }

    public EstatisticaEntity(String urlEncurtada) {
        this.acessos = 0L ;
        this.urlEncurtada = urlEncurtada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        EstatisticaEntity that = (EstatisticaEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(urlEncurtada, that.urlEncurtada) && Objects.equals(acessos, that.acessos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, urlEncurtada, acessos);
    }

    @Override
    public String toString() {
        return "Estatistica{" +
                "id=" + id +
                ", urlEncurtada='" + urlEncurtada + '\'' +
                ", acessos=" + acessos +
                '}';
    }
}
