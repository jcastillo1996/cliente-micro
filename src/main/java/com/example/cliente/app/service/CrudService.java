package com.example.cliente.app.service;

import java.util.List;

public interface CrudService<T, ID> {
    T registrar(T t);

    T modificar(T t);

    List<T> listar();

    T buscarPorId(ID id);
}
