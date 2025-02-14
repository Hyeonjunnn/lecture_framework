package com.beyond.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.aop.aspect
 * <p>fileName       : CharacterAspect
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

@Aspect
@Component
public class CharacterAspect {
    /*
    * 포인트 커트 표현식
    *   - 스프링 AOP에서 포인터 커트는 AspectJ의 포인트 커트 표현식을 이용해서 정의한다.
    *   - execution([접근제한자] 리턴타입 클래스이름.메소드이름([파라미터, ...]))
    *       - 메소드 실행에 대한 표현식이다.
    *       - * : 모든 값을 표현한다.
    *       - .. : 0개 이상을 의미한다.
    *   - args()
    *       - 대상 메소드에 전달되는 매개값을 어드바이스에 전달하기 위한 표현식이다.
    *   - bean()
    *       - 어드바이스를 적용할 빈의 ID를 지정하는 표현식이다.
    *   - @annotation()
    *       - 주어진 어노테이션을 갖는 조인 포인트에 어드바이스를 적용하기 위한 표현식이다.
    * */

    // @Pointcut("execution(* com.beyond.aop.character.Character.quest(..))")
    @Pointcut("execution(* com.beyond.aop.character.Character.quest(..)) && args(questName)")
    public void questPointCut(String questName) {
    }

    // @Before("execution(* com.beyond.aop.character.Character.quest(..))")
    // @Before("questPointCut(questName)")
    public void beforeQuest(String questName) {
        // 퀘스트를 수행하기 전에 필요한 작업들 수행
        System.out.println(questName + " 퀘스트 준비 중..");
    }

    // @After("execution(* com.beyond.aop.character.Character.quest(..))")
    // @After("questPointCut(questName)")
    public void afterQuest(String questName) {
        // 퀘스트 수행 결과에 상관없이 필요한 작업들 수행
        System.out.println(questName + " 퀘스트 수행 완료..");
    }

    // @AfterReturning(
    //         pointcut = "execution(* com.beyond.aop.character.Character.quest(..))",
    //         returning = "result"
    // )
    public void success(String result) {
        // 퀘스트를 정상적으로 완료된 후 필요한 작업을 수행

        System.out.println("result : " + result);
        System.out.println("퀘스트 수행 완료..");
    }

    // @AfterThrowing(
    //         pointcut = "questPointCut(questName)",
    //         throwing = "exception"
    // )
    public void fail(String questName, Exception exception) {
        // 퀘스트 수행 중 에러가 발생했을 때 필요한 작업들 수행

        System.out.println(exception.getMessage());
        System.out.println(questName + " 퀘스트 수행 중 에러가 발생했습니다..");
    }

    @Around("execution(* com.beyond.aop.character.Character.quest(..))")
    public String around(ProceedingJoinPoint joinPoint) {
        String result = null;
        // String questName = (String) joinPoint.getArgs()[0];
        String questName = "[" + (String) joinPoint.getArgs()[0] + "]";

        try {
            // before 어드 바이스에 대한 기능을 수행
            System.out.println(questName + " 퀘스트 준비 중..");

            // 타겟 객체의 메소드를 실행시킨다.
            // joinPoint.proceed();

            // 타겟 객체의 메소드에 리턴값이 있는 경우
            // result = (String) joinPoint.proceed();

            // 타겟 객체의 메소드에 파라미터 값을 변경해서 전달하는 경우
            result = (String) joinPoint.proceed(new Object[]{questName});
            
            // after-returning 어드바이스에 대한 기능을 수행
            System.out.println("result : " + result);
            System.out.println(questName + " 퀘스트 수행 완료..");
            
        } catch (Throwable e) {
            // after-throwing 어드바이스에 대한 기능을 수해이
            System.out.println(e.getMessage());
            System.out.println(questName +  " 퀘스트 수행 중 에러가 발생..");

        }

        return result;
    }

}
