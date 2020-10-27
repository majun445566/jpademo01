package com.example.mj.demo01.controller;

import com.example.mj.demo01.entity.Book;
import com.example.mj.demo01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    BookService bookService;
    @RequestMapping("all")
    public List<Book> getUserAll(){
        return bookService.getBooks();
    }
    @RequestMapping("initBooks")
    public String initBooks(){
        for (int i =0;i<20;i++){
            Book book = new Book(i,"name"+i);
            bookService.insertBook(book);
        }
        return "hello word";
    }
}
