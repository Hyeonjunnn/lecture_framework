package com.beyond.university.common.exception;

import com.beyond.university.common.exception.message.ExceptionMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.io.Serial;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.common.Exception
 * <p>fileName       : UniversityException
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

@Getter
public class UniversityException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -5751177390123781591L;

    private final String type;

    private final HttpStatus status;

    public UniversityException(ExceptionMessage message) {
        super(message.getMessage());
        this.type = message.name();
        this.status = message.getStats();
    }

}
