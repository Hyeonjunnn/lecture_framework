package com.beyond.university.department.model.dto;

import com.beyond.university.department.model.vo.Department;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
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

    // @NotBlank // NULL, "", " "을 허용하지 않는다
    // @NotNull // NULL 만 허용하지 않는다.
    // @NotEmpty // NULL, ""을 허용하지 않는다
    @Schema(description = "학과 이름", example = "일어학과")
    @NotBlank(message = "null, '', ' '을 허용하지 않는다. ")
    private final String name;

    @Schema(description = "계열", example = "인문사회")
    private final String category;

    @Schema(description = "개설 여부", example = "Y")
    @Pattern(regexp = "Y|N", message = "'Y' 또는 'N'이어야 한다.")
    private final String openYn;

    @Schema(description = "정원", example = "50")
    @PositiveOrZero(message = "0보다 크거나 같아야 한다.")
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
