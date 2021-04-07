package cl.falabell.test.products.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(customExecption.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public customExecption handleCustomException(customExecption customException) {
        return customException;
    }


}