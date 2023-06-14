package com.project1.board.controller;

import com.project1.board.dto.UserForm;
import com.project1.board.service.UserSerivce;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@ResponseBody
public class UserControll {
    private final UserSerivce userService;

    @PostMapping("/signup")
    public void signUpUser(@RequestBody @Valid UserForm userForm) throws Exception {
        userService.signUpUser(userForm);
    }

    @PostMapping("/login")
    public boolean loginUser(@RequestBody @Valid UserForm userForm) {
        return userService.login(userForm);
    }
}
