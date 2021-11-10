package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 風楪fy
 * @create: 2021-08-06 18:21
 **/
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void saveUsername(String username){
        userMapper.insertUsername(username);
    }
    public String getUsername(int id)
    {
        return userMapper.selectUsername(id);
    }
    public void deleteUsername(int id)
    {
        userMapper.delUsername(id);
    }
    public void updateUsername(int id,String name)
    {
        userMapper.updateUsername(id,name);
    }

}
