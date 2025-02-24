package com.beyond.university.common.model.dto;

import com.beyond.university.department.model.vo.Department;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.common.exception.dto
 * <p>fileName       : BaseResponseDto
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
public class BaseResponseDto<T> {

    @Schema(description = "응답 코드", example = "200")
    protected final int code;

    @Schema(description = "응답 메시지", example = "OK")
    protected final String message;

    @Schema(description = "응답 데이터")
    protected final List<T> items;

    public BaseResponseDto(HttpStatus status, T department) {
        this.code = status.value();
        this.message = status.getReasonPhrase();
        this.items = Collections.singletonList(department);
    }

    protected BaseResponseDto(HttpStatus status, List<T> items) {
        this.code = status.value();
        this.message = status.getReasonPhrase();
        this.items = items;
    }
}
