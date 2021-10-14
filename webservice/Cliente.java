package webservice;

import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Cliente {
    private static int a;
    private static int b;
    private static String operation;

    public static void main(String[] args) {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource servico = client.resource("http://localhost:9000/calculadora");

        WebResource servicoSomarInt = servico.path("somarInt").path(a + "/" + b);
        ClientResponse respostaSomarInt = servicoSomarInt.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        String respostaJsonSomarInt = respostaSomarInt.getEntity(String.class);
        System.out.println("Add result: " + respostaJsonSomarInt);
    }
}
