package com.kbss.application.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kbss.application.service.HelloService;

@Component
@Path("/hello")
public class HelloResource {
	
	@Autowired
	private HelloService helloService;

	@GET
	@Produces("application/json")
    public String get() {
        return this.helloService.get();
    }
}