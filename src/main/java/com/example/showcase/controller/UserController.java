package com.example.showcase.controller;

import com.example.showcase.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @PostMapping("register")
    public String Register(@RequestBody User user){
        System.out.println(user.name + user.password);
        return "";
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
