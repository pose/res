package com.resqueue.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/auth")
@Produces(MediaType.APPLICATION_JSON)
public class AuthService {

	@GET
	public User getToken(@QueryParam("username") String username, 
			@QueryParam("password") String password) {
		
		User user = new User(username, password);
		
		return user;
	}

}

class User{
	private String username;
	private String password;
	
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
