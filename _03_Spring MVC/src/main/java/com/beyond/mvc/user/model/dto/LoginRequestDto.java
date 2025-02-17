package com.beyond.mvc.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.mvc.user.model.dto
 * <p>fileName       : LoginRequestDto
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

@Getter
// @Setter
@ToString
// @NoArgsConstructor
// @AllArgsConstructor
@RequiredArgsConstructor
public class LoginRequestDto {

    private final String username;

    private final String password;
}
