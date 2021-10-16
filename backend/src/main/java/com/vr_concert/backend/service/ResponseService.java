package com.vr_concert.backend.service;

import com.vr_concert.backend.model.ResponseFormat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface ResponseService {
    public ResponseEntity<ResponseFormat> basic(HttpStatus httpStatus, String msg, Object data);
}
