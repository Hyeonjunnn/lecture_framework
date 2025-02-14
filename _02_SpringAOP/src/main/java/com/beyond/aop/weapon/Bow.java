package com.beyond.aop.weapon;

import com.beyond.aop.annotation.Repeat;
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
@Component("windForce")
public class Bow extends Weapon {
    public Bow(@Value("윈드 포스") String name) {
        super(name);
    }

    @Override
    // 속성명이 value일 때만 아래와 같이 사용이 가능하다.
    // @Repeat("반복 횟수 지정")
    // @Repeat(count = 3)
    @Repeat(value = "반복 횟수 3", count = 3)
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
