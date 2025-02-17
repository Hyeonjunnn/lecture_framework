package com.beyond.mvc.user.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.mvc.user.model.dto
 * <p>fileName       : UserResponseDto
 * <p>author         : hjsong
 * <p>date           : 2025-02-17
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-17        hjsong             최초 생성
 */

@Data
// @AllArgsConstructor
@RequiredArgsConstructor
public class UserResponseDto {

    private final int no;

    private final String username;

    @JsonIgnore
    private final String address;
}
