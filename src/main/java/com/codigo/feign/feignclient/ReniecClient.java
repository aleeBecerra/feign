package com.codigo.feign.feignclient;

import com.codigo.feign.response.ReniecResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="reniec-client", url="https://api.apis.net.pe/v2/reniec")
public interface ReniecClient {
    @GetMapping("/dni")
    ReniecResponse getInfo(@RequestParam("numero") String numero,
                           @RequestHeader("Authorization")String token);

    //dni?numero=46027897
    //numero es un request param porque el numero está detrás de
}
