package com.example.configclient.controller;

import com.example.configclient.config.ConfigGlobal;
import com.example.configclient.config.ConfigSample;
import com.example.configclient.config.ConfigVault;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "sample")
@RequiredArgsConstructor
public class SampleController {
    private final ConfigSample configSample;
    private final ConfigGlobal configGlobal;
    private final ConfigVault configVault;

    @GetMapping
    private Mono<String> getSample() {
        return Mono.just(configSample.getSampleText());
    }

    @GetMapping(path = "/secret")
    private Mono<String> getSecret() {
        return Mono.just(configSample.getSecretText());
    }

    @GetMapping(path = "/global")
    private Mono<String> getGlobal() {
        return Mono.just(configGlobal.getGlobalSample());
    }

    @GetMapping(path = "/vault")
    private Mono<String> getVault() {
        return Mono.just(configVault.getSampleText());
    }
}
