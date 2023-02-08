package com.springb.learning.backend.business;

import com.springb.learning.backend.model.MRegisterRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Objects;

@Service
public class TestBusiness {
    public String register(MRegisterRequest request) throws IOException {
        if (request == null) {
            throw new IOException("null.request");
        }
        // validate email
        if (Objects.isNull(request.getEmail()) ) {
            throw new IOException("null.email");
        }
        // validate
        return "";
    }
}
