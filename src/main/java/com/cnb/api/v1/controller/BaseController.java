package com.cnb.api.v1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {

    protected <T> ResponseEntity<T> buildSuccessResponseWithNoContent() {
        return ResponseEntity.noContent().build();
    }

    protected <T> ResponseEntity<T> buildCreatedSuccessResponse(T object) {
        return ResponseEntity.status(HttpStatus.CREATED).body(object);
    }

    protected <T> ResponseEntity<T> buildSuccessResponse(T object) {
        return ResponseEntity.ok(object);
    }

    protected <T> ResponseEntity<T> buildSuccessResponseAccepted() {
        return ResponseEntity.accepted().build();
    }
}
