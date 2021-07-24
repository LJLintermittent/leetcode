package com.learn.leetcode.fourhundredfiftyTofivehundred;


/**
 * Description:
 * date: 2021/7/24 11:41
 * Package: com.learn.leetcode.fourhundredfiftyTofivehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC478 {


    public static void main(String[] args) {

    }

    double rad, xc, yc;

    /**
     * 在圆内随机生成点
     */
    public LC478(double radius, double x_center, double y_center) {
        rad = radius;
        xc = x_center;
        yc = y_center;

    }

    public double[] randPoint() {
        double x0 = xc - rad;
        double y0 = yc - rad;

        while (true) {
            double xg = x0 + Math.random() * rad * 2;
            double yg = y0 + Math.random() * rad * 2;
            if (Math.sqrt(Math.pow((xg - xc), 2) + Math.pow((yg - yc), 2)) <= rad) {
                return new double[]{xg, yg};
            }
        }
    }
}
