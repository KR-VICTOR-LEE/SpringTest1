package com.example.studyone.controller.api;

import com.example.studyone.controller.CrudController;
import com.example.studyone.model.network.request.ItemApiRequest;
import com.example.studyone.model.network.response.ItemApiResponse;
import com.example.studyone.service.ItemApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/item")
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse> {
/*
    @Autowired
    private ItemApiLogicService itemApiLogicService;

    @PostConstruct
    public void init(){
        this.baseService = itemApiLogicService;
    }//서비스 확인. 축소가능

 */
/*
    @Override
    @PostMapping("") // /api/item
    public Header<ItemApiResponse> create(@RequestBody Header<ItemApiRequest> request) {

        return itemApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}") // /api/item/1.....10000
    public Header<ItemApiResponse> read(@PathVariable Long id) {

        return itemApiLogicService.read(id);
    }

    @Override
    @PutMapping("") // api/
    public Header<ItemApiResponse> update(@RequestBody Header<ItemApiRequest> request) {

        return itemApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {

        return itemApiLogicService.delete(id);
    }
    */ //crudController 작성 후 삭제가능.

}
