package com.tds.company.dto;

import java.io.Serializable;
import java.util.Objects;

public class UrlDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String url;

    public UrlDTO() {
    }

    public UrlDTO(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UrlDTO urlDTO = (UrlDTO) o;
        return Objects.equals(url, urlDTO.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }
}
