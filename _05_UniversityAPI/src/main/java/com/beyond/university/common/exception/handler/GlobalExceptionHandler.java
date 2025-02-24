package com.beyond.university.common.exception.handler;

import com.beyond.university.common.exception.UniversityException;
import com.beyond.university.common.exception.dto.ApiErrorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.common.Exception.handler
 * <p>fileName       : GlobalExceptionHandler
 * <p>author         : hjsong
 * <p>date           : 2025-02-24
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-24        hjsong             최초 생성
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UniversityException.class)
    public ResponseEntity<ApiErrorResponseDto> handleException(UniversityException e) {

        log.error("UniversityException : {}", e.getMessage());

        return new ResponseEntity<>(
                new ApiErrorResponseDto(e.getStatus().value(), e.getType(), e.getMessage())
                , e.getStatus()
        );
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponseDto> handleException(Exception e) {

        log.error("GlobalException : {}", e.getMessage());

        return new ResponseEntity<>(
                new ApiErrorResponseDto(HttpStatus.INTERNAL_SERVER_ERROR.value()
                        , HttpStatus.INTERNAL_SERVER_ERROR.name()
                        , e.getMessage())
                , HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
