/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.status;

/**
 * 状态机
 * @author cgx1844568
 * @date 2014-12-11
 * @time 11:38:44
 * 
 */
public class StatusMachine {

    private BaseStatus currentStatus;

    public BaseStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(BaseStatus currentStatus) {
        this.currentStatus = currentStatus;
    }
    
    public static void main(String[] args){
        StatusMachine sm = new StatusMachine();
        sm.setCurrentStatus(new StartStatus());
        while(sm.getCurrentStatus() != null){
            sm.getCurrentStatus().handle(sm);
        }
        System.out.println("over");
    }
    
}
