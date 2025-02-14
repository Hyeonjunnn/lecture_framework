package com.beyond.aop.weapon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.di.weapon
 * <p>fileName       : Weapon
 * <p>author         : hjsong
 * <p>date           : 2025-02-13
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-13        hjsong             최초 생성
 */

@Getter
@Setter
@AllArgsConstructor
public abstract class Weapon {
    protected String name;

    public abstract String attack();
}
