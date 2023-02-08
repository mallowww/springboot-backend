package com.springb.learning.backend.api;

import com.springb.learning.backend.model.MRegisterRequest;
import com.springb.learning.backend.model.TestResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestApi {
    @GetMapping
    public TestResponse test() {
        TestResponse response = new TestResponse();
        response.setName("Olly");
        response.setFood("Pizza");
        return  response;
    }

    @PostMapping
    @RequestMapping("/register")
    private String register(@RequestBody MRegisterRequest request) {
        return "Received " + request;
    }
}
