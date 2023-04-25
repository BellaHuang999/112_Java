package com.bella;

public class Test0425 {
    public static void main(String[] args) {

        double sum2 = calc(10);
        System.out.println(sum2);

        double volumn = getVolumn(10, 3);
        System.out.println(volumn);

    }


    //圓面積計算
    public static double getArea(double r) {
        double area = r * r * Math.PI;
        return area;
    }

    //圓柱體體積
    public static double getVolumn(double r, double height) {
        double volumn = getArea(r) * height;
        return volumn;
    }


    //矩形面積
    public static int getArea2(int length, int width) {
        int area = length * width;
        return area;
    }


    //方程式計算
    private static double calc(double x) {
        double sum = x * x + 5 * x + 3;
        return sum;
    }
}
