package com.project1.board.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardForm {

    @Min(1)
    private Long userIdx;

    @NotEmpty(message = "제목은 필수 입니다.")
    @Size(max = 100, message = "제목은 100자리를 초과할 수 없습니다.")
    private String title;

    @NotEmpty(message = "내용은 필수 입니다.")
    private String contents;
}
