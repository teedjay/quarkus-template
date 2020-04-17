package com.teedjay;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestResource {

    @Inject
    TestData data;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testing() {
        return data.getName();
    }

}
