package com.example.showcase.controller;

import com.example.showcase.entity.User;
import com.example.showcase.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("register")
    public String Register(@RequestBody User user){
        System.out.println(user.name + user.password);
        return "";
    }

    @GetMapping("/all")
    public List<User> FindAll()
    {
        List<User> all = userMapper.findAll();
        System.out.println(all);
        return all;
    }

    @GetMapping("/{id}")
    public String GetUserInfo(@PathVariable int userId)
    {
        return "user post";
    }

    @GetMapping("/{id}/{postId}")
    public String GetPost()
    {
        return "";
    }
}
