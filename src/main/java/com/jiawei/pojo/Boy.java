package com.jiawei.pojo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 27073 on 2018/3/18.
 */

@Entity
public class Boy {

    @Id
    @GeneratedValue
    private Integer id;
    private String hobby;
    private Integer age;

    public Boy() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "id=" + id +
                ", hobby='" + hobby + '\'' +
                ", age=" + age +
                '}';
    }
}
