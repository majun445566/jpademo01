package com.example.mj.demo01.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/10/26-10-26-23:42
 * @Description:com.example.mj.demo01.entity
 * @Version:1.0
 **/
@Entity(name="t_book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(name="book_name",nullable = false)
    private  String name;
    private  Integer age;
    private  Float price;
    private String address;
    private String author;
    @Transient
    private  String description;

    public Book(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book() {
    }
}
