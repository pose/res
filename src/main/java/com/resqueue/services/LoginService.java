package com.resqueue.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Query;
import org.hibernate.Session;

import com.resqueue.models.HibernateUtil;
import com.resqueue.models.Users;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginService {

    @GET
    public  List<Users> get() {
    
    	Session session = HibernateUtil.getSession();
        String hql = "from Users u";
        Query query = session.createQuery(hql);

        List<Users> list =(List<Users>) query.list();

        return  list ;
    	
    }

}

