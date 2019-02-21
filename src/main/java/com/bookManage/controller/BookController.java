package com.bookManage.controller;

import com.bookManage.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@RequestMapping("/book")
public class BookController {

    @Resource(name="bookService")
    private BookService bookService;

    @GetMapping
    public String start(){
        return "index";
    }
}
