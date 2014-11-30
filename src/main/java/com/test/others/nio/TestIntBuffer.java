/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.nio;

import java.nio.IntBuffer;

/**
 *
 * @author cgx1844568
 */
public class TestIntBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntBuffer buffer = IntBuffer.allocate(8);
        for(int i = 0; i < buffer.capacity() - 1; i ++ ){
            //数据不足时默认为0.但是buffer.hasRemaining()时,还是为false
            int j = 2*(i + 1);
            buffer.put(j);
        }
        buffer.flip();
        while(buffer.hasRemaining()){
            int j = buffer.get();
            System.out.println(j +" ");
        }
    }
    
}
