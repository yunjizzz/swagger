package com.yunji.swagger.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    @ApiModelProperty(value = "사용자의 나이", example = "20", required = true)
    private int age;

    @ApiModelProperty(value = "사용자의 이름", example = "yunji", required = true)
    private String name;
}
