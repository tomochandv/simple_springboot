package com.project1.board.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {
    @NotEmpty(message = "이메일은 필수 입니다.")
    @Size(max = 100, message = "이메일은 100자리를 초과할 수 없습니다.")
    private String email;
}
