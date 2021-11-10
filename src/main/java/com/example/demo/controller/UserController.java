package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//@RestController = @ResponseBody + @Controller
@RestController
public class UserController {

    @Autowired

    UserService userService;

    //这是一个示例,以POST方法提交要被处理的数据(即username)
    @PostMapping("/user/post")
    public void uploadUsername(String username){
        //按住ctrl键来看看具体调用的这个函数吧
        userService.saveUsername(username);
    }

    //在这里试着仿照上面的uploadUsername,进行controller层、service层和mapper层的完善吧
    @GetMapping("/user/get")
    public String getUsername(int id){
        return userService.getUsername(id);
    }

    @DeleteMapping("/user/delete")
    public void deleteUsername(int id)
    {
        userService.deleteUsername(id);
    }

    @PutMapping("user/put")
    public void updateUsername(int id,String name)
    {
        userService.updateUsername(id,name);
    }


}
