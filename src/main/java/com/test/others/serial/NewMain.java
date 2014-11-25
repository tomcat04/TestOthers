/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author cgx1844568
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        System.out.println("1:" + File.pathSeparator);
        System.out.println("2:" + File.separator);
        String path = "D:" + File.separator + "person.txt";
        File file = new File(path);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            Person per = new Person("GGG",10);
            oos.writeObject(per);
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Person per = (Person) ois.readObject();
            System.out.println("per.name = " + per.getName());
        }
    }
    
}
