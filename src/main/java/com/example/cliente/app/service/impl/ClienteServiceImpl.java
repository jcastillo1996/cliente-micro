package com.example.cliente.app.service.impl;

import com.example.cliente.app.model.Cliente;
import com.example.cliente.app.repo.ClienteRepo;
import com.example.cliente.app.repo.GenericRepo;
import com.example.cliente.app.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends CrudImpl<Cliente, Long> implements ClienteService {

    @Autowired
    private ClienteRepo repo;

    @Override
    protected GenericRepo<Cliente, Long> getRepo() {
        return repo;
    }
}
