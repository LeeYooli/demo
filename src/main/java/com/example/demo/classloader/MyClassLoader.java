package com.example.demo.classloader;

public class MyClassLoader extends ClassLoader{

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.system.class.loader"));
        System.out.println(getSystemClassLoader());

        sun.misc.Launcher l = sun.misc.Launcher.getLauncher();
        System.out.println(l.getClassLoader());

        ClassLoader classLoader = getSystemClassLoader();
        Class clazz = classLoader.loadClass("com.example.demo.DeadLockDemo");
        classLoader = null;

    }
}
