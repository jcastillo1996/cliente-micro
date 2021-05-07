package com.example.cliente.app.service.impl;

import com.example.cliente.app.repo.GenericRepo;
import com.example.cliente.app.service.CrudService;

import java.util.List;
import java.util.Optional;

public abstract class CrudImpl<T, ID> implements CrudService<T, ID> {
    protected abstract GenericRepo<T, ID> getRepo();

    @Override
    public List<T> listar() {
        return getRepo().findAll();
    }

    @Override
    public T buscarPorId(ID id) {
        Optional<T> entity = getRepo().findById(id);
        return entity.isPresent() ? entity.get() : null;
    }

    @Override
    public T registrar(T t) {
        return getRepo().save(t);
    }

    @Override
    public T modificar(T t) {
        return getRepo().save(t);
    }
}
