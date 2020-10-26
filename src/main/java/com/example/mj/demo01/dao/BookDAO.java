package com.example.mj.demo01.dao;

import com.example.mj.demo01.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/10/26-10-26-23:55
 * @Description:com.example.mj.demo01.dao
 * @Version:1.0
 **/
public interface BookDAO extends JpaRepository<Book, Integer> {
    List<Book> getBooksByAuthorStartingWith(String author);
    List<Book> getBooksByPriceGreaterThan(Float price);
    @Query(value="select * from t_book b where b.id =(select max(id) from t_book )" , nativeQuery=true)
    Book getMaxIdBook();
}
