package com.example.showcase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post")
public class PostController {

    @GetMapping("/{id}")
    public String GetPost()
    {
        return "";
    }
}
