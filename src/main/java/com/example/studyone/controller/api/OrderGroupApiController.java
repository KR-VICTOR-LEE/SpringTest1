package com.example.studyone.controller.api;

import com.example.studyone.controller.CrudController;
import com.example.studyone.ifs.CrudInterface;
import com.example.studyone.model.entity.OrderGroup;
import com.example.studyone.model.network.Header;
import com.example.studyone.model.network.request.OrderGroupApiRequest;
import com.example.studyone.model.network.response.OrderGroupApiResponse;
import com.example.studyone.service.OrderGroupApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/orderGroup")
public class OrderGroupApiController extends CrudController<OrderGroupApiRequest, OrderGroupApiResponse, OrderGroup> {
/*
    @Autowired
    private OrderGroupApiLogicService orderGroupApiLogicService;

    @PostConstruct
    public void init(){
        this.baseService = orderGroupApiLogicService;
    }


    @Override
    @PostMapping("")
    public Header<OrderGroupApiResponse> create(@RequestBody Header<OrderGroupApiRequest> request) {
        return orderGroupApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<OrderGroupApiResponse> read(@PathVariable Long id) {
        return orderGroupApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<OrderGroupApiResponse> update(@RequestBody Header<OrderGroupApiRequest> request) {
        return orderGroupApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return orderGroupApiLogicService.delete(id);
    }
     */
}
