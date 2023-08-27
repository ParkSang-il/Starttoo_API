package me.silvernine.tutorial.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BizException extends RuntimeException{

    private int status;
    private String code;
    private String message;

    BizException(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
