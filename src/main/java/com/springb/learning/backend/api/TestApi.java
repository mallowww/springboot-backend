package com.springb.learning.backend.api;

import com.springb.learning.backend.model.TestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping
    @RequestMapping("/2")
    public TestResponse test2() {
        TestResponse response = new TestResponse();
        response.setName("Olly 2");
        response.setFood("Pizza 2");
        return  response;
    }

    @PostMapping
    private String register() {
        return "";
    }
}
