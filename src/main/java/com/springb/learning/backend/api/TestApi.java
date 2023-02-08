package com.springb.learning.backend.api;

import com.springb.learning.backend.business.TestBusiness;
import com.springb.learning.backend.model.MRegisterRequest;
import com.springb.learning.backend.model.TestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestApi {
    private final TestBusiness business;

    public TestApi(TestBusiness business) {
        this.business = business;
    }

    @GetMapping
    public TestResponse test() {
        TestResponse response = new TestResponse();
        response.setName("Olly");
        response.setFood("Pizza");
        return  response;
    }

    @PostMapping
    @RequestMapping("/register")
    private ResponseEntity<String> register(@RequestBody MRegisterRequest request) {
        String response = null;
        try {
            response = business.register(request);
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();
        }
    }
}
