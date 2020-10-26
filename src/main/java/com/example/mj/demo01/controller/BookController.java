package com.example.mj.demo01.controller;

import com.example.mj.demo01.entity.Book;
import com.example.mj.demo01.service.BookSservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/10/26-10-26-21:24
 * @Description:com.example.mj.demo01
 * @Version:1.0
 **/
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookSservice bookSservice;
    @RequestMapping("all")
    public String getUserAll(){
        return "hello word";
    }
    @RequestMapping("initBooks")
    public String initBooks(){
        for (int i =0;i<20;i++){
            Book book = new Book(i,"name"+i);
            bookSservice.insertBook(book);
        }
        return "hello word";
    }
}
