package com.test.others.classloader.cat;

import java.lang.reflect.Method;

public class ClassIdentity {

    /**
     * 不同加载器加载同一个类,类型转换时出现异常
     * @param args 
     */
    public static void main(String[] args) {
        new ClassIdentity().testClassIdentity();
    }

    public void testClassIdentity() {
        String classDataRootPath = "C:\\Documents and Settings\\Administrator\\workspace\\Classloader\\classData";
        FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath);
        FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);
        String className = "com.example.Sample";
        try {
            Class<?> class1 = fscl1.loadClass(className);
            Object obj1 = class1.newInstance();
            Class<?> class2 = fscl2.loadClass(className);
            Object obj2 = class2.newInstance();
            Method setSampleMethod = class1.getMethod("setSample", java.lang.Object.class);
            setSampleMethod.invoke(obj1, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
