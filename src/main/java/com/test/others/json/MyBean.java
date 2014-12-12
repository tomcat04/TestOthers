/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.json;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cgx1844568
 * @date 2014-12-10
 * @time 15:44:44
 *
 */
public class MyBean {

    private String str = "hello world";
    
    private boolean bl = Boolean.FALSE;
    
    private int i = 20;
    
    private Date date = new Date();
    
    private String[] str1 = {"hello","world"};
    
    private List<String> list = new ArrayList<String>() {
        {
            add("hello");
            add("world");
        }
    };
    
    //private Calendar c = Calendar.getInstance();

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public boolean isBl() {
        return bl;
    }

    public void setBl(boolean bl) {
        this.bl = bl;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String[] getStr1() {
        return str1;
    }

    public void setStr1(String[] str1) {
        this.str1 = str1;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

//    public Calendar getC() {
//        return c;
//    }
//
//    public void setC(Calendar c) {
//        this.c = c;
//    }
    
}
