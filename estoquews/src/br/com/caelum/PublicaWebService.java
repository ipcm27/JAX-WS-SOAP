package br.com.caelum;

import javax.xml.ws.Endpoint;
import br.com.caelum.PublicaWebService;

public class PublicaWebService {

    public static void main(String[] args) {

        EstoqueWS implementacaoWS = new EstoqueWS();
        String URL = "http://localhost:8080/estoquews";

        System.out.println("EstoqueWS rodando: " + URL);

        //associando URL com implementacao
        Endpoint.publish(URL, implementacaoWS);
    }

}