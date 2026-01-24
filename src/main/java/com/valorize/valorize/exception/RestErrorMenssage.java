package com.valorize.valorize.exception;

import org.springframework.http.HttpStatus;

public class RestErrorMenssage {
    private HttpStatus status;
    private String menssage;

    public RestErrorMenssage(HttpStatus status, String menssage) {
        this.status = status;
        this.menssage = menssage;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMenssage() {
        return menssage;
    }

    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }
}
