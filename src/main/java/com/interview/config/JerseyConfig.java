package com.interview.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.interview.service.HelloService;
import com.interview.service.ReverseService;
import com.interview.service.UserResource;

@Configuration
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloService.class);
        register(ReverseService.class);
        register(UserResource.class);
    }
}
