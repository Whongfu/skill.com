package com.hf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc // 自动配置 MockMvc
class GlobalExceptionApplicationTests {

    @Autowired
    private MockMvc mockMvc;  // 注入 MockMvc 实例

    @Test
    void contextLoads() throws Exception {
        // 使用 MockMvc 发起 HTTP GET 请求并验证响应
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/ex/generate")).andReturn();
        System.out.print(result.getResponse().getContentAsString());
    }
}
