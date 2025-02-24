package com.beyond.university.department.model.dto;

import com.beyond.university.department.model.vo.Department;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.department.model.dto
 * <p>fileName       : DepartmentRequestDto
 * <p>author         : hjsong
 * <p>date           : 2025-02-24
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-24        hjsong             최초 생성
 */

@Getter
@ToString
@AllArgsConstructor
public class DepartmentRequestDto {

    @Schema(description = "학과 이름", example = "일어학과")
    private final String name;

    @Schema(description = "계열", example = "인문사회")
    private final String category;

    @Schema(description = "개설 여부", example = "Y")
    private final String openYn;

    @Schema(description = "정원", example = "50")
    private final int capacity;

    public Department toDepartment() {
        return Department.builder()
                .name(getName())
                .category(getCategory())
                .openYn(getOpenYn())
                .capacity(getCapacity())
                .build();
    }
}
