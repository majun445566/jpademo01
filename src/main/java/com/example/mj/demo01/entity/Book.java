package com.example.mj.demo01.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/10/26-10-26-23:42
 * @Description:com.example.mj.demo01.entity
 * @Version:1.0
 **/
@Entity(name="t_book")
@Data
@Builder
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(name="book_name",nullable = false)
    private  String name;
    @Column
    private  Integer age;
    @Column
    private  Float price;
    @Column
    private String address;
    @Column
    private String author;
    @Transient
    private  String description;
}
