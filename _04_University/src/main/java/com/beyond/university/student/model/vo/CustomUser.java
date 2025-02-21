package com.beyond.university.student.model.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.io.Serial;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.student.model.vo
 * <p>fileName       : CustomUser
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

public class CustomUser extends User {

    @Serial
    private static final long serialVersionUID = -4979784267496042074L;

    private final String email;

    private final String name;

    private final LocalDateTime enrollDate;

    private final LocalDateTime modifyDate;

    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String email, String name, LocalDateTime enrollDate, LocalDateTime modifyDate) {
        super(username, password, authorities);
        this.email = email;
        this.name = name;
        this.enrollDate = enrollDate;
        this.modifyDate = modifyDate;
    }

    public CustomUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, String email, String name, LocalDateTime enrollDate, LocalDateTime modifyDate) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.email = email;
        this.name = name;
        this.enrollDate = enrollDate;
        this.modifyDate = modifyDate;
    }
}
