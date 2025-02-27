package com.beyond.university.auth.model.mapper;

import com.beyond.university.auth.model.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.auth.mode
 * <p>fileName       : AuthMapper
 * <p>author         : hjsong
 * <p>date           : 2025-02-25
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-25        hjsong             최초 생성
 */

@Mapper
public interface AuthMapper {

    User selectUserById(@Param("id") String id);
}
