package com.test;

import java.math.MathContext;
import java.util.ArrayList;

public class jdk8deom1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++) {
            list.add(i);
        }

        for (Integer lista:list){
            System.out.println(lista.toString());
        }
    }
}
