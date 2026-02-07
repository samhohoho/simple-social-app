package com.samhoho.simple_social_app.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "httpBin", url = "${httpBinUrl}")
public interface HttpBinProxy {

    @PostMapping("/delay/{n}")
    void delay(@PathVariable int n);
}
