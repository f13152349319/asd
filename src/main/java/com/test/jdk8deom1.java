package com.test;

import java.math.MathContext;

public class jdk8deom1 {
    public static void main(String[] args) {
        String num="";
        StringBuilder a=new StringBuilder("123456789");
        a.insert(1,"颤三");
        System.out.println(a.toString());
    }
}
