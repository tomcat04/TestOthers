/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.nio;

import java.nio.ByteBuffer;

/**
 *
 * @author cgx1844568
 * @date 2014-12-1
 * @time 8:35:52
 *
 */
public class BufferWrap {

    /**
     * 分配缓冲区的两种方式
     */
    ByteBuffer buffer1 = ByteBuffer.allocate(10);
    
    byte array[] = new byte[10];
    ByteBuffer buffer2 = ByteBuffer.wrap(array);
    
    /**
     * allocate与allocateDirect
     * 1.allocate是JVM内存区,allocateDirect在系统级别
     * 2.allocateDirect是否包含backing array不确定,allocate一定有backing array(JDK docs)
     */
    ByteBuffer buffer3 = ByteBuffer.allocateDirect(10);
}
