package com.hubeao.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        int i=9/0;
        return "index";
    }
//    成功提交项目到github教程
//    https://blog.csdn.net/u014135752/article/details/79951802
}
