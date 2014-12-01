/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cgx1844568
 */
public class FileReadBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\wms.log");
            FileChannel fc = fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            fc.read(buffer);
            buffer.flip();
            while(buffer.remaining() > 0){
                byte b = buffer.get();
                //System.out.print(b);
                System.out.println();
                System.out.print(((char)b));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadBuffer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReadBuffer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(FileReadBuffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}