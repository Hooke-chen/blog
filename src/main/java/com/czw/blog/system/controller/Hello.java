package com.czw.blog.system.controller;

import com.czw.blog.system.bean.Author;
import com.czw.blog.system.utils.Handle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    @Autowired
    private Author author;

    @RequestMapping("/hello")
    @ResponseBody
    public Handle Hello(){
        String msg="姓名："+author.getName()+" 网址："+author.getUrl();
        return Handle.ok(msg);
    }


    @RequestMapping(value = "/success")
    @ResponseBody
    public Handle success(){
        String msg="姓名："+author.getName()+" 网址："+author.getUrl();
        return Handle.ok(msg,author);
    }
}
