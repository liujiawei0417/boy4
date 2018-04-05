package com.jiawei.controller;

import com.jiawei.dao.BoyRepository;
import com.jiawei.pojo.Boy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 27073 on 2018/3/18.
 */

@RestController
@SpringBootApplication
public class BoyController {


    @Autowired
    private BoyRepository boyRepository;

    //获取男生列表   两种写法  或者是 @ResultMapping
    @GetMapping(value= "/boyList")
    public List<Boy> getAllBoy(){
        return boyRepository.findAll();
    }

    //插入   事务管理
    @PostMapping(value = "/saveBoy")
    @Transactional
    public Boy saveBoy(@RequestParam("age") Integer myage,
                          @RequestParam("hobby") String myHobby){
        Boy boy = new Boy();
        boy.setAge(myage);
        boy.setHobby(myHobby);
        Boy returnBoy = boyRepository.save(boy);
        return returnBoy;

    }

    //查询一个男生   调用
    @GetMapping(value="/boy/{id}")
    public Boy searchBoy(@PathVariable("id") Integer id){
        return boyRepository.findOne(id);
    }
    //更新   不能缺少id
    @PutMapping(value="/boy/{id}")
    public Boy updateBoy(@PathVariable("id") Integer id,@RequestParam("age") Integer myage,
                         @RequestParam("hobby") String myHobby){
        Boy boy = new Boy();
        boy.setId(id);
        boy.setAge(myage);
        boy.setHobby(myHobby);
        return boyRepository.save(boy);
    }

    //删除
    @DeleteMapping(value="/deleteBoy/{id}")
    public void deleteBoy(@PathVariable("id") Integer id){
        boyRepository.delete(id);
    }

    //通过年龄来查询
    @GetMapping(value="/getBoy/age/{age}")
    public List<Boy> getBoyByAge(@PathVariable("age") Integer age){
        return boyRepository.findByAge(age);
    }

}
