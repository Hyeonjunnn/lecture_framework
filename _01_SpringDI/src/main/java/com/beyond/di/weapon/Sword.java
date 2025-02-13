package com.beyond.di.weapon;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.di.weapon
 * <p>fileName       : Sword
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

@Component
// @ToString(callSuper = true)
public class Sword extends Weapon {
    public Sword(@Value("크리스탈 소드") String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "검을 휘두른다.";
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                '}';
    }

}
