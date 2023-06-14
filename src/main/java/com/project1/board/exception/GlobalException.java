package com.project1.board.exception;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalException {
    @ExceptionHandler(DuplicateEmailException.class)
    public JSONObject duplicateEmailException(){
        return ErrorResponse.JsonErrorResponse(400, "중복된 이메일 입니다.");
    }

    @ExceptionHandler(BoardCreatedException.class)
    public JSONObject boardCreatedException(){
        return ErrorResponse.JsonErrorResponse(400, "저장중 에러가 발생하였습니다.");
    }

    @ExceptionHandler(NonUserException.class)
    public JSONObject nonUserException(){
        return ErrorResponse.JsonErrorResponse(400, "존재하지않는 사용자 입니다.");
    }
}
