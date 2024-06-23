package com.jwtjava.jwtjava.exception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
@AllArgsConstructor
public class ProductApiException extends RuntimeException{
    private HttpStatus status;
    private String message;
}