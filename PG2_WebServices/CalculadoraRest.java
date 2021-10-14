package webservice;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("calculadora")
public class CalculadoraRest {   

    @Path("somarInt/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public somarInt(@PathParam("a") int op1,@PathParam("b") int op2) {

    }

    @Path("multiplicarInt/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public multiplicarInt(@PathParam("a") int op1, @PathParam("b") int op2) {

    }
}
