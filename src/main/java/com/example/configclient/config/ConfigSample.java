package com.example.configclient.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@RefreshScope
@RequiredArgsConstructor
public class ConfigSample {
    @Value("${sample.text}")
    private String sampleText;

    @Value("${sample.secretText}")
    private String secretText;
}
