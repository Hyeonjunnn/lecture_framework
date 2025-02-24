package com.beyond.university.common.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.common.Exception
 * <p>fileName       : ApiResponseDto
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
@ToString
@AllArgsConstructor
public class ApiErrorResponseDto {
    private final int code;

    private final String status;

    private final String message;
}
