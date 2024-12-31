package com.hf.pojo.model.response;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * @Author wanhongfu
 * @Date 2024年12月27 16:27
 */
@Data
@SuperBuilder
public class ApiResponse {
    private boolean success;
    private String code;
    private String message;


//    public static String getError(String message) {
//        String msg = message.isBlank() ? "失败" : message;
//        ApiResponse response = ApiResponse.builder().success(false).code("2001").message(msg).build();
//        return JSON.toJSONString(response);
//    }
//
//    public static String getSuccess(String message) {
//        String msg = message.isBlank() ? "成功" : message;
//        ApiResponse response = ApiResponse.builder().success(true).code("200").message(msg).build();
//        return JSON.toJSONString(response);
//    }
}
