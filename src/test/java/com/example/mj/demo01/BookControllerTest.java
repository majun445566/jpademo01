package com.example.mj.demo01;

import com.example.mj.demo01.dao.BookDAO;
import com.example.mj.demo01.entity.Book;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.*;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/10/31-10-31-22:34
 * @Description:com.example.mj.demo01
 * @Version:1.0
 **/
@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {
    @Autowired
    protected MockMvc mockMvc;

    @Test
    public void TestXXX() throws Exception {
        ResultActions result = mockMvc.perform(
                        MockMvcRequestBuilders.get("/book/queryBookById")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("id", "3")
        );
        result.andReturn().getResponse().setCharacterEncoding("UTF-8");
        result.andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(MockMvcResultHandlers.print());
    }
}
