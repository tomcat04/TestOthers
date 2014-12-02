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
 * @time 15:18:25
 *
 */
public class MyFormbean {

    private String name;
    
    private String status;
    
    private Date born;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public final void setStatus(String status) {
        this.status = status;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }
    
    public MyFormbean(){}
    
    public MyFormbean(MyOperationEnum op){
        switch(op){
            case CREATE:
                setStatus("01");
            case PUBLISH:
                System.out.println("****");
        }
    }
    
}
