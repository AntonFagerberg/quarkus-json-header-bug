package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.vertx.core.json.JsonObject;

@Path("/hello")
public class GreetingResource {

    @POST
    @Produces("application/vnd.api+json")
    @Consumes("application/vnd.api+json")
    public JsonObject hello(JsonObject body) {
        return body;
    }
}