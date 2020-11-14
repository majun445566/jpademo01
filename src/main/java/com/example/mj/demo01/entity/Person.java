package com.example.mj.demo01.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Table;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/10/29-10-29-0:09
 * @Description:com.example.mj.demo01.entity
 * @Version:1.0
 **/
@Data
@Table(name = "person")
@NameStyle(Style.camelhumpAndLowercase)
public class Person {
    @javax.persistence.Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String name;
    private Integer age;
    private Boolean gender;
    /*@ColumnType(jdbcType = JdbcType.VARCHAR, typeHandler = StringListTypeHandler.class)
    private List<String> hobbies;*/
}
