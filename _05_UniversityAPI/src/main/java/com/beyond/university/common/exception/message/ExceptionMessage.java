package com.beyond.university.common.exception.message;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.common.Exception.message
 * <p>fileName       : ExceptionMessage
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
@RequiredArgsConstructor
public enum ExceptionMessage {

    DEPARTMENT_NOT_FOUND("학과 정보를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    DEPARTMENT_NO_CONTENT("학과 정보를 찾을 수 없습니다.", HttpStatus.NO_CONTENT);

    private final String message;

    private final HttpStatus stats;

}
