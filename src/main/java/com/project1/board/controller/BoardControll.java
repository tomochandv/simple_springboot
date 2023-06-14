package com.project1.board.controller;

import com.project1.board.domain.Board;
import com.project1.board.dto.BoardForm;
import com.project1.board.dto.UserForm;
import com.project1.board.service.BoardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@ResponseBody
public class BoardControll {
    private final BoardService boardService;

    @PostMapping("/board")
    public boolean createdBoard(@RequestBody @Valid BoardForm form) throws Exception {
        return boardService.boardCreated(form);
    }

    @GetMapping("/board")
    public List<Board> list() throws Exception {
        return boardService.boardList();
    }
}
