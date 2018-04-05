package com.jiawei.dao;

import com.jiawei.pojo.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 27073 on 2018/3/18.
 */
public interface BoyRepository extends JpaRepository<Boy,Integer>{

    //通过年龄查询解耦
    public List<Boy> findByAge(Integer age);



}
