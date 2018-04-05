package com.jiawei.controller;

import com.jiawei.pojo.Boy;
import com.jiawei.util.IMoocJSONResult;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 测试json
 * Created by 27073 on 2018/3/22.
 */
@RestController
@SpringBootApplication
public class BoyJsonController {


    @RequestMapping(value = "/ceshi" ,method = RequestMethod.GET)
    public  String toGetJson(){
        return "haha ,Iam liujaiweijgjgjhj+cschi";
    }

    @RequestMapping(value = "/ceshi2" ,method = RequestMethod.GET)
    public IMoocJSONResult getBoyJson(){

        Boy boy = new Boy();
        boy.setAge(133243);
        boy.setHobby("测试热部署12345");
        return IMoocJSONResult.ok(boy);


    }








}
