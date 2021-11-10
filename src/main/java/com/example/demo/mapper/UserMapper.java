package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * @author: 風楪fy
 * @create: 2021-08-06 18:17
 **/

@Mapper
@Repository
public interface UserMapper {
    //具体的sql语句在同名xml文件中
    void insertUsername(@Param("username") String username);
    String selectUsername(@Param("id") int id);
    void delUsername(@Param("id")int id);
    void updateUsername(@Param("id")int id,@Param("username")String name);
}
