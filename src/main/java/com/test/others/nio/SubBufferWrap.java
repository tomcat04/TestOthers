/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.nio;

import java.nio.ByteBuffer;

/**
 * 子缓冲区与父缓冲区数据共享
 * @author cgx1844568
 */
public class SubBufferWrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        for(int i = 0; i< buffer.capacity() ;i ++){
            buffer.put((byte)i);
        }
        buffer.position(3);
        buffer.limit(7);
        ByteBuffer subBuffer = buffer.slice();
        
        for(int i = 0; i < subBuffer.capacity(); i ++){
            byte b = subBuffer.get(i);
            b *= 10;
            subBuffer.put(i, b);
        }
//        buffer.flip();
        /**
         * buffer.flip()读转写
         * buffer.clear()写转读
         */
        buffer.clear();
        System.out.println("buffer.position():" + buffer.position());
        System.out.println("buffer.limit()" + buffer.limit());
        while(buffer.remaining() > 0){
            System.out.println(buffer.get());
        }
    }
    
}
