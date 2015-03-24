package com.kbss.application.config;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.kbss.application.resource.HelloResource;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloResource.class);
        register(LoggingFilter.class);
    }

}
