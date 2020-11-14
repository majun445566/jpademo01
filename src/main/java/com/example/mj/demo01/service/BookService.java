package com.example.mj.demo01.service;

import com.example.mj.demo01.dao.BookDAO;
import com.example.mj.demo01.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/10/27-10-27-0:17
 * @Description:com.example.mj.demo01.service
 * @Version:1.0
 **/
@Service
public class BookService {
    @Autowired
    BookDAO bookDAO;

    public List<Book> getBooks() {
        return bookDAO.findAll();
    }

    public Book insertBook(Book book) {
        return bookDAO.save(book);
    }

    public void deleteBook(Book book) {
        bookDAO.delete(book);
    }

    public Book queryBookById(Integer id) {
        return bookDAO.findById(id).orElse(new Book());
    }
}
