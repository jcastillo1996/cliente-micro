package com.example.cliente.app.controller;

import com.example.cliente.app.model.Cliente;
import com.example.cliente.app.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping(path = "/listar")
    public ResponseEntity<List<Cliente>> listarClientes() {
        return ResponseEntity.ok(service.listar());
    }

}
