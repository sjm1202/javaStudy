package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 键盘录入一个三位数，获取其中的个位、十位、百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
