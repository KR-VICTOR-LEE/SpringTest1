package com.example.studyone.controller.api;

import com.example.studyone.controller.CrudController;

import com.example.studyone.model.network.Header;
import com.example.studyone.model.network.request.UserApiRequest;
import com.example.studyone.model.network.response.UserApiResponse;
import com.example.studyone.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserApiLogicService userApiLogicService;


    @PostConstruct
    public void init(){
        this.baseService = userApiLogicService;
    }

    /*
    @Override
    @PostMapping("") // /api/user
    public Header<UserApiResponse> create(@RequestBody Header <UserApiRequest> request) {
        Log.info("{}",request);
        return userApiLogicService.create(request) ;
    }

    @Override
    @GetMapping("{id}") // /api/user/{id}
    public Header read(@PathVariable(name = "id")Long id) {
        Log.info("read : {}",id);

        return userApiLogicService.read(id);
    }

    @Override
    @PutMapping("") // /api/user
    public Header<UserApiResponse> update(@RequestBody Header <UserApiRequest> request) {

        return userApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}") // /api/user/{id}
    public Header delete(@PathVariable Long id) {

        return userApiLogicService.delete(id);
    }
     */
}
