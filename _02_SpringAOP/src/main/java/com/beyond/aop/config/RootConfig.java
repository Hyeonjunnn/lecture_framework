package com.beyond.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.aop.config
 * <p>fileName       : RootConfig
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

@Configuration
@ComponentScan("com.beyond.aop")
@EnableAspectJAutoProxy
public class RootConfig {

}
