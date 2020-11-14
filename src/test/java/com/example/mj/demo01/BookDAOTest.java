package com.example.mj.demo01;

import com.example.mj.demo01.dao.BookDAO;
import com.example.mj.demo01.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import java.util.Optional;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/11/14-11-14-12:08
 * @Description:com.example.mj.demo01
 * @Version:1.0
 **/
@SpringBootTest
public class BookDAOTest {
    @Autowired
    BookDAO dao;
    @Test
    public void test1(){
        Optional<Book> books=  dao.findById(10);
        System.out.println("books.get() = " + books.get());
        Book book= books.get();
        book.setPrice(23.45f);
        System.out.println("dao.save(book) = " + dao.save(book));
        books=  dao.findById(10);
        System.out.println("books.get() = " + books.get());
    }
    @Test
    public void test2(){
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("id", ExampleMatcher.GenericPropertyMatchers.contains());//模糊查询匹配开头，即{username}%
               // .withMatcher("address" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{address}%
                //.withIgnorePaths("password");//忽略字段，即不管password是什么值都不加入查询条件
        Example example = Example.of(Book.builder()
                .id(7)
                .build());
        System.out.println("dao.findAll(example) = " + dao.findAll(example));
    }
}
