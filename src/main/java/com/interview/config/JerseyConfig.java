package com.interview.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.interview.exception.GenericExceptionMapper;
import com.interview.service.*;


@Configuration
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloService.class);
        register(ReverseService.class);
        register(UserResource.class);
        register(GenericExceptionMapper.class);
    }
}
