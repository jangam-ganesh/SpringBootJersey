package com.interview.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.interview.exception.NotFounException;
import org.springframework.stereotype.Service;

@Service
@Path("/hello")
public class HelloService {

    @GET
    @Produces("text/plain")
    public String hello() {
        throw new NotFounException("Some Issue.",403);
    }
}
