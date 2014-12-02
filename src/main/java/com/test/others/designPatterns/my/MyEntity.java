/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.my;

import java.util.Date;

/**
 *
 * @author cgx1844568
 * @date 2014-12-1
 * @time 15:18:35
 *
 */
public class MyEntity {

    private long id;
    
    /**
     * 名称
     */
    private String name;
    
    /**
     * 出生日期
     */
    private Date born;
    
    /**
     * 性别
     */
    private String sex;
    
    private int age;
    
    /**
     * 状态
     */
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
