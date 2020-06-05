package com.czw.blog.system.utils;

import org.springframework.http.HttpStatus;

import java.util.concurrent.ConcurrentHashMap;

public class Handle extends ConcurrentHashMap<String,Object> {
    private static Handle handle=new Handle();

    public Handle(){
        this.put("coed",HttpStatus.OK.value());
    }

    public static Handle ok(){
        handle.put("msg","success");
        return handle;
    }

    public static Handle ok(String msg){
        handle=Handle.ok();
        handle.put("msg",msg);
        return handle;
    }

    public static Handle ok(String msg,Object data) {
        handle = Handle.ok(msg);
        handle.put("data", data);
        return handle;
    }
}
