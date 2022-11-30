package org.drools.hackfest2022;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.drools.hackfest2022.model.Item;
import org.drools.hackfest2022.model.ItemCategory;

@Path("/scan")
public class GreetingResource {

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello(String payload) {
        return Response.ok(new Item("zxing", payload, ItemCategory.GROCERY, 0, 0)).build();
    }
}