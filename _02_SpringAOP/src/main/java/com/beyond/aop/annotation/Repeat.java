package com.beyond.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
/**
 * <p>
 *
 * <p>packageName    : com.beyond.aop.annotation
 * <p>fileName       : Repeat
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

// @Target(ElementType.METHOD)
@Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Repeat {
    String value() default "";
    int count() default 1;
}
