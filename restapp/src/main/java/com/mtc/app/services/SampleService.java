package com.mtc.app.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("testservice")
public class SampleService {

	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	@Path("/{username}/{email}")
//	public String greet(@PathParam("username")String username,@PathParam("email")String email) {
//		return "Hello! "+username+" Good Morning! "+"Email : "+email;
//	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greet(@QueryParam("username")String username,@QueryParam("email")String email) {
		return "Hello! "+username+" Good Morning! "+"Email : "+email;
	}
	
}
