package com.example.studyone.controller;

import com.example.studyone.ifs.CrudInterface;
import com.example.studyone.model.network.Header;
import com.example.studyone.service.BaseService;
import com.example.studyone.service.UserApiLogicService;
import org.springframework.web.bind.annotation.*;

public abstract class CrudController<Req, Res> implements CrudInterface<Req, Res> {

    protected UserApiLogicService baseService;

    @Override
    @PostMapping("")
    public Header<Res> create(@RequestBody Header<Req> request) {

        return baseService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<Res> read(@PathVariable Long id) {

        return baseService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<Res> update(@RequestBody Header<Req> request) {

        return baseService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {

        return baseService.delete(id);
    }
}
