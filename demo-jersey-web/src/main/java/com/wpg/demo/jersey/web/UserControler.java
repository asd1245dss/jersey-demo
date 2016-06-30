package com.wpg.demo.jersey.web;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/user")
public class UserControler {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/{userId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@Context HttpServletRequest request, @PathParam("userId") String userId) {
        return String.format("%sGet%s", request.getSession().toString(), userId);
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String add() {
        return "Add";
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String update() {
        return "Update";
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public String delete() {
        return "Delete";
    }

}
