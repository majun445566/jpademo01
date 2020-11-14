package com.example.mj.demo01;

import com.example.mj.demo01.dao.BookDAO;
import com.example.mj.demo01.entity.Book;
import com.example.mj.demo01.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class Demo01ApplicationTests {
    @Autowired
    TestRestTemplate testRestTemplate;
    @Autowired
    BookService bookService;
    @Autowired
    BookDAO bookDAO;

    @Test
    void test2() {
        Book book1 = Book.builder()
                .name("马军12").address("曙光乡1")
                .build();
        Book book2 = bookDAO.save(book1);
        log.info("book1:{}", book1);
        log.info("book2:{}", book2);
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
    }

    @Test
    void test3() {
        try {
            Book book = bookDAO.getOne(1);
            System.out.println("book = " + book);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void test4() {
        try {
            Optional<Book> o = bookDAO.findById(3);
            System.out.println("o.isPresent() = " + o.isPresent());
            System.out.println("book = " + o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void test1() {
        ResponseEntity r = testRestTemplate
                .postForEntity("/book/saveBook",
                        Book.builder().id(1).name("果果")
                        , Book.class);
        System.out.println(r.getBody());
    }


    @Test
    void contextLoads() {
        bookService.deleteBook(Book.builder().id(2).name("果果").build());
    }


    /**
     * 查询数据
     */
    void queryAll() {
        int i = 1;
        for (Book book : bookService.getBooks()) {
            System.out.println("book" + i++ + " = " + book);
        }
    }

}
