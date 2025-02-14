package com.beyond.aop.aspect;

import com.beyond.aop.annotation.Repeat;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.aop.aspect
 * <p>fileName       : WeaponAspect
 * <p>author         : hjsong
 * <p>date           : 2025-02-14
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-14        hjsong             최초 생성
 */

@Aspect
@Component
public class WeaponAspect {

    // // @Around("execution(* com.beyond.aop.weapon.Sword.attack())")
    // // @Around("execution(* com.beyond.aop.weapon.Weapon.attack()) && bean(sword)")
    // // @Around("execution(* com.beyond.aop.weapon.*.attack()) && bean(sword)")
    // @Around("execution(* com.beyond.aop.weapon.Weapon.attack()) && !@annotation(com.beyond.aop.annotation.NoLogging)")
    // public String attackAdvice(ProceedingJoinPoint joinPoint) {
    //     String result = null;
    //
    //     try {
    //         System.out.println("공격을 준비중 입니다.");
    //
    //         result = (String) joinPoint.proceed();
    //
    //         System.out.println(result);
    //         System.out.println("공격을 성공했습니다.");
    //
    //     } catch (Throwable e) {
    //         System.out.println("에러가 발생했습니다.");
    //
    //     }
    //
    //     return result;
    // }

    @Around("@annotation(com.beyond.aop.annotation.Repeat)")
    public String attackAdvice(ProceedingJoinPoint joinPoint) {
        String result = null;
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Repeat repeat = signature.getMethod().getAnnotation(Repeat.class);

        // System.out.println(repeat);
        // System.out.println(repeat.value());
        // System.out.println(repeat.count());

        try {
            System.out.println("공격을 준비중 입니다.");

            result = (String) joinPoint.proceed();

            for (int i = 0; i < repeat.count(); i++) {
                System.out.println(result);
            }

            System.out.println("공격을 성공했습니다.");

        } catch (Throwable e) {
            System.out.println("에러가 발생했습니다.");

        }

        return result;
    }

}
