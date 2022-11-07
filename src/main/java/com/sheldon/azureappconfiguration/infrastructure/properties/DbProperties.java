package com.sheldon.azureappconfiguration.infrastructure.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "db")
public class DbProperties {
    private String url;
    private String user;
    private String password;
}
