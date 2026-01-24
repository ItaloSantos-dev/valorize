package com.valorize.valorize.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import tools.jackson.databind.exc.InvalidFormatException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    //Controlar qual Exception chamar
    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException exception, HttpHeaders headers, HttpStatusCode statusCode, WebRequest request){

        Throwable cause = exception.getCause();
        if(cause instanceof InvalidFormatException invalidFormat){
            String fieldName = invalidFormat.getPath().get(0).getPropertyName();
            String invalidValue = invalidFormat.getValue().toString();
             RestErrorMenssage error = new RestErrorMenssage(HttpStatus.BAD_REQUEST, "Valor '" + invalidValue + "' inválido "+" na coluna '" + fieldName + "' ");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }

        return super.handleHttpMessageNotReadable(exception, headers, statusCode, request);
    }

    @ExceptionHandler(FailedAcessAPIException.class)
    private RestErrorMenssage failedAcessAPI(FailedAcessAPIException exception){
        RestErrorMenssage threatResponse = new RestErrorMenssage(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        return threatResponse;
    }
}
