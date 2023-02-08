package com.springb.learning.backend.api;

import com.springb.learning.backend.business.TestBusiness;
import com.springb.learning.backend.model.MRegisterRequest;
import com.springb.learning.backend.model.TestResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestApi {
    // METHOD 1 - field injection
//    @Autowired
//    private TestBusiness business;

    // METHOD 2 - constructor injection
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
    private String register(@RequestBody MRegisterRequest request) {
        String response = business.register(request);
        return response;
    }
}
