package com.samhoho.simple_social_app.controller;

import com.samhoho.simple_social_app.proxy.HttpBinProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
    private final HttpBinProxy httpBinProxy;

    public DemoController(HttpBinProxy httpBinProxy) {
        this.httpBinProxy = httpBinProxy;
    }

    @GetMapping("/delay/{second}")
    public void delay(@PathVariable("second") int second) {
        httpBinProxy.delay(second);
    }
}
