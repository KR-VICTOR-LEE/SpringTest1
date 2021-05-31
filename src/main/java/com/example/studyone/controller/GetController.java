package com.example.studyone.controller;

import com.example.studyone.model.SearchParam;
import com.example.studyone.model.network.Header;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest(){
        return "test";
    }
    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam (name = "password")String pwd){
        String password = "dddd";
        System.out.println("id : "+id);
        System.out.println("pwd : "+pwd);

        return id+pwd;
    }
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAcconut());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());
    // {"account" : "", "email" : "", "page" : 0}
        return searchParam;
    }

    public Header getHeader(){

        //{"resultCode: "OK" , "description" : "OK"}
        return Header.builder().resultCode("OK").description("OK").build();
    }
}
