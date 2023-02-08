package com.springb.learning.backend.business;

import com.springb.learning.backend.exception.BaseException;
import com.springb.learning.backend.exception.UserException;
import com.springb.learning.backend.model.MRegisterRequest;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TestBusiness {
    public String register(MRegisterRequest request) throws BaseException {
        if (request == null) {
            throw UserException.requestNull();
        }
        // validate email
        if (Objects.isNull(request.getEmail())) {
            throw UserException.emailNull();
        }
        // validate
        return "";
    }
}
