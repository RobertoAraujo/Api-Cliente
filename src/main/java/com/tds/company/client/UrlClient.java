package com.tds.company.client;

import com.tds.company.dto.UrlDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "urlCliente", url = "${feign.url.client}")
public interface UrlClient {
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/v1/url/salvar")
    UrlDTO createUrl(@RequestBody UrlDTO urlDTO);

    @RequestMapping(method = RequestMethod.POST, value = "/v1/url/buscar")
    @Headers(value = "Content-Type: application/json")
    UrlDTO getUrlDTO(@RequestBody UrlDTO urlDTO);
}
