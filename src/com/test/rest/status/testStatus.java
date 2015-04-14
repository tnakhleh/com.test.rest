package com.test.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/v1/test/status")
public class testStatus {
	
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getTitle() {
        return "<p>Got it!</p>";
    }
    
    @Path("/v2")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getTitle2() {
        return "<p>Second get</p>";
    }   
    
    @Path("/v3")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getTitle3() {
        return "<p>thered one</p>";
    }     
}
