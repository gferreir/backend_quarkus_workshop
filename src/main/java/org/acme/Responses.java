package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/resources")
public class Responses {

    @GET
    @Path("register")
    @Produces(MediaType.TEXT_PLAIN)
    public String doRegister() {
        return "Customer registered";
    }

    @GET
    @Path("notify")
    @Produces(MediaType.TEXT_PLAIN)
    public String doNotify() {
        return "Customer notified";
    }
}