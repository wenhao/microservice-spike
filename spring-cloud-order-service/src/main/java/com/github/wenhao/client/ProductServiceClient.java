package com.github.wenhao.client;

import com.github.wenhao.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "SPRING-CLOUD-PRODUCT-SERVICE")
public interface ProductServiceClient {

    @RequestMapping(value = "products/{productId}", method = RequestMethod.GET)
    Product get(@PathVariable Long productId);
}
