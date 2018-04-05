package com.jiawei;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 27073 on 2018/3/18.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String test(){
        return "我在测试";
    }
}
