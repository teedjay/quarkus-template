package com.teedjay;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.api.ResourcePath;
import io.quarkus.qute.api.VariantTemplate;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    VariantTemplate hello;

    @Inject
    @ResourcePath("hello.xml")
    Template xml;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public TemplateInstance getAsText() {
        return hello.data("message", "hello");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getAsHtml() {
        return hello.data("message", "hello html template");
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public TemplateInstance getAsXml() {
        return xml.data("message", "hello xml template");
    }

}
