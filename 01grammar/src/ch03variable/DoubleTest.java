package ch03variable;

import java.text.DecimalFormat;

/**
 * @version 1.0.0
 * @Author Zachary
 * @createTime 2021年02月26日 22:26:00
 * 计算精度问题
 */
public class DoubleTest {
    public static void main(String[] args) {
        double v = 0.5d;
        if (2 / 0.5 == 4.0) {
            System.out.println("正常计算");
        }

    }
}
