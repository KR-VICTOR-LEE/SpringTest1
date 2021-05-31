package com.example.studyone.service;

import com.example.studyone.ifs.CrudInterface;
import com.example.studyone.model.network.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.parser.Entity;

public abstract class BaseService<Req, Res> implements CrudInterface<Req, Res> {

    @Autowired(required = false)
    protected JpaRepository<Entity,Long> baseRepository;
/*
    @Override
    public Header<Res> create(Header<Req> request) {
        return null;
    }

    @Override
    public Header<Res> read(Long id) {
        return null;
    }

    @Override
    public Header<Res> update(Header<Req> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }

 */
}
