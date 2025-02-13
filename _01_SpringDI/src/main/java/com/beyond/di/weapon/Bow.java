package com.beyond.di.weapon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.di.weapon
 * <p>fileName       : Bow
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

@Primary
@Component("windforce")
public class Bow extends Weapon {
    public Bow(@Value("윈드 포스") String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "활을 쏜다.";
    }

    @Override
    public String toString() {
        return "Bow{" +
                "name='" + name + '\'' +
                '}';
    }
}
