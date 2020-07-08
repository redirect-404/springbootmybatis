package com.test.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String findPage(@PathVariable String page){
        System.out.println(page);
        return page;
    }
}
