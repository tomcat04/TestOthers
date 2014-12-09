package com.test.others.classloader.cat;

public class ClassLoaderTree {

    /**
     * 类加载器树
     * @param args 
     */
    public static void main(String[] args) {
        ClassLoader loader = ClassLoaderTree.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
    }
}
