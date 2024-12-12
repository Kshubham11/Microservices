package com.dailycodebuffer.ProductService.exception;

import lombok.Data;

@Data
public class ProductServiceCustomException extends RuntimeException {

    private String errorCode;

    public ProductServiceCustomException(String message, String erroCode) {
        super(message);
        this.errorCode = erroCode;
    }
}
