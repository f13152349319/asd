package com.test;

import java.util.Scanner;

public class deom2 {
    public static void main(String[] args) {
        //冒泡排序
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入五组数字");
        int[] nums=new int[5];
        for (int i=0;i<nums.length;i++){
            nums[i]=scanner.nextInt();
            System.out.println("请输入第"+(i+2)+"组数字");
        }
        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]<nums[j+1]) {
                    int num=nums[j];	 //将小的给予新的变量
                    nums[j]=nums[j+1];	//将大的值给与小的变量
                    nums[j+1]=num;			//小的值再去与后面值比较

                }
            }
        }
        for(int num: nums){
            System.out.println(num);
        }

    }
}