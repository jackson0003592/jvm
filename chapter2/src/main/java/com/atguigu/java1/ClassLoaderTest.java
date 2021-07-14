package com.atguigu.java1;

import sun.misc.Launcher;

import java.net.URL;

public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//        System.out.println(systemClassLoader);
//
//        ClassLoader extClassLoader = systemClassLoader.getParent();
//        System.out.println(extClassLoader);
//
//        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
//        System.out.println(bootstrapClassLoader);
//
//        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
//        for (URL urL : urLs) {
//            System.out.println(urL);
//        }
//        System.out.println("=============================================================================");
//        String extDirs = System.getProperty("java.ext.dirs");
//        for (String s : extDirs.split(":")) {
//            System.out.println(s);
//        }

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);


    }
}
