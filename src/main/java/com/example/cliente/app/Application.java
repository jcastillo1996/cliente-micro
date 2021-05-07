package com.example.cliente.app;

import com.example.cliente.app.model.Cliente;
import com.example.cliente.app.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import static com.example.cliente.app.util.Utils.fechaRandom;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    ClienteService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.asList(
                new Cliente(null, "0001", "PEDRO", "MORALES CARRASCO", fechaRandom()),
                new Cliente(null, "0002", "PACO", "YUNQUE", fechaRandom()),
                new Cliente(null, "0003", "MARCELA", "BARRANTES TEJADA", fechaRandom()),
                new Cliente(null, "0004", "DIANA", "CASTILLO CHAVEZ", fechaRandom())
        )
                .forEach(cliente -> service.registrar(cliente));

    }
}
