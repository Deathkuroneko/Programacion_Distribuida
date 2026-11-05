package com.programacion.distribuida;

import jakarta.ws.rs.SeBootstrap;

import java.net.URI;

public class Web02Main {

    static void main() {
        SeBootstrap.Configuration config = SeBootstrap.Configuration.builder()
                .host("0.0.0.0")
                .port(9090)
                .protocol("http").build();


        SeBootstrap.start(MiAplicationRest.class, config).thenAccept(
                instance -> {
                    System.out.print(instance);
                    URI uri = instance.configuration().baseUri();

                    System.out.println("Servidor iniciado por:" + uri);
                }

        ).exceptionally( t -> {t.printStackTrace();
        return null;
        });



    }
}
