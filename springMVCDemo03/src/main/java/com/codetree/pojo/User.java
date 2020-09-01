package com.codetree.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private String uName;
    private Integer age;
    private Date birthday;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "uName='" + uName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
