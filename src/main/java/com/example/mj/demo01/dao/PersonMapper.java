package com.example.mj.demo01.dao;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/10/29-10-29-0:11
 * @Description:com.example.mj.demo01.dao
 * @Version:1.0
 **/
import com.example.mj.demo01.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@org.apache.ibatis.annotations.Mapper
public interface PersonMapper extends Mapper<Person> {
    @Select("SELECT * FROM person WHERE name=#{name}")
    Person selectByName(@Param("name") String name);
    List<Person> selectByAge(@Param("age") int age);
}
