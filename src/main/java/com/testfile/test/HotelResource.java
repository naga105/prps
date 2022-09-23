package com.testfile.test;

import DAO.DAO;
import Model.Hotel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.model.ContractProvider;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/hotel")
public class HotelResource {
    private final DAO dao = new DAO();

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {

        ArrayList<Hotel> user = dao.viewPage();
        return gson.toJson(user) ;
    }

    @GET
    @Path("/search")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    public Response searchHotel(@FormDataParam("searchString") String searchString){
        System.out.println(searchString);
        return Response.ok(searchString,MediaType.APPLICATION_JSON_TYPE).build();
    }
}
