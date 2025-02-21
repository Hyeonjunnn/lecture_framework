package com.beyond.university.auth.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.auth.mode.vo
 * <p>fileName       : User
 * <p>author         : hjsong
 * <p>date           : 2025-02-20
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-20        hjsong             최초 생성
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int no;

    private String id;

    private String password;

    private String role;

    private String name;

    private String phone;

    private String email;

    private String address;

    private String hobby;

    private String status;

    private LocalDate enrollDate;

    private LocalDate modifyDate;
}
