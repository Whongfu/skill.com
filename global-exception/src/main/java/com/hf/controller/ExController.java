package com.hf.controller;

import com.hf.pojo.model.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.BindException;

/**
 * @Author wanhongfu
 * @Date 2024年12月27 16:53
 */
@RestController
@RequestMapping("/ex")
public class ExController {

    @GetMapping("/generate")
    public void generateException() throws Exception {
        ApiResponse response = ApiResponse.builder().success(false).code("2001").message("1111").build();
        throw new BindException("参数异常");
    }
}
