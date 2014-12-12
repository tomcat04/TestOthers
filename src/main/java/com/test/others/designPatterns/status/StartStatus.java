/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.status;

/**
 *
 * @author cgx1844568
 * @date 2014-12-11
 * @time 11:41:10
 *
 */
public class StartStatus implements BaseStatus{

    @Override
    public void handle(StatusMachine statusMachine) {
        System.out.println("status.start");
        statusMachine.setCurrentStatus(new DraftStatus());
    }

}
