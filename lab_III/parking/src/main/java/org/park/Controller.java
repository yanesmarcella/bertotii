package org.park;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

@Path("/livro")
public class Controller {

	
	Model model = new Model();
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{genero}/{editora}/")
    public Response livro2( @PathParam String editora, @PathParam String genero) {	
		List<Livro> livrosEncontrados = model.buscarEspecificacao(new Especificacao(genero, editora));	
		String json = new Gson().toJson(livrosEncontrados);
    	return Response.status(200).entity(json).build();	
    }
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{genero}")
    public Response livro2(@PathParam String genero) {	
		List<Livro> livrosEncontradosporGenero = model.buscarGenero(genero);	
		String json = new Gson().toJson(livrosEncontradosporGenero);
    	return Response.status(200).entity(json).build();	
    }
	
	
	
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasymmmmmmm";
    }
}