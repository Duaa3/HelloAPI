package com.dynamicdoers.ddquoteapi.controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController

public class MainController {
    @GetMapping(path = "/api/hw")
    public HashMap<String, String> getRequest(@RequestParam(value = "name", defaultValue = "Word") String name) {
        HashMap<String, String> responses = new HashMap<String, String>();
        try {
            responses.put("Result", "Hello " + name);
            responses.put("Status", "200");
        } catch (Exception e) {
            responses.put("Errors", e.getMessage());
            responses.put("Status", "500");
        }
        return responses;
    }
    @PostMapping(path = "/api/post")
    public String getPostRequest(){
        return "This is POST request";
    }

    @DeleteMapping(path = "/api/del")
    public String getDeleteRequest(){
        return "This is DELETE request";
    }
}



