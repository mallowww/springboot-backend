package com.springb.learning.backend.business;

import com.springb.learning.backend.exception.BaseException;
import com.springb.learning.backend.exception.ProductException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ProductBusiness {
    public String getProductById(String id) throws BaseException {
        // todo: get data from database
        if (Objects.equals("1234", id)) {
            throw ProductException.notFound();
        }
        return id;
    }
}
