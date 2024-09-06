package com.itheima.operator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);
        // -
        System.out.println(5 - 1);
        // * (shift + 数字8)
        System.out.println(7 * 9);
        // 如果在计算的时候游小数参与
        // 结论：
        // 1、整数参与计算，结果只能得到整数
        // 2、在代码中，如果有小数参与计算，结果可能是不精确的
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
        System.out.println(1.2 * 6);


        // 除法
        System.out.println(10 / 2); // 5
        System.out.println(10 / 3); // 2
        // 取模
        System.out.println(10 % 2); // 0
        System.out.println(10 % 3); // 1
        System.out.println(10 % 3); // 1

    }
}
