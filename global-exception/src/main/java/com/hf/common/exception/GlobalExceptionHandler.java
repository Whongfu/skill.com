package com.hf.common.exception;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hf.pojo.model.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.BindException;

/**
 * @Author wanhongfu
 * @Date 2024年12月27 15:43
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({BindException.class, MethodArgumentNotValidException.class})
    public String handleBindException(Exception exception) {
        JSONObject json = new JSONObject();
        json.put("data", exception.getMessage());
        return json.toJSONString();
    }
}
