package com.resqueue.services;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/list")
@Produces(MediaType.APPLICATION_JSON)
public class TimeService {

    @GET
    public ArrayList<Integer> get() {
    	ArrayList<Integer> list = new ArrayList<Integer>(10);
    	list.add(4);
    	list.add(3);
    	list.add(2);
    	list.add(1);
        return list;
    }

}

