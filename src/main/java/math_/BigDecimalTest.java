package math_;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * BigDecimal的一些使用技巧
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        // 两个小数相乘
        BigDecimal b1 = new BigDecimal("1999");
        BigDecimal b2 = new BigDecimal("0.6666");
        BigDecimal result1 = b1.multiply(b2);
        System.out.printf("%s乘以%s等于%s%n", b1, b2, result1);
        // 保留两位小数
        BigDecimal result2 = result1.setScale(2,BigDecimal.ROUND_DOWN);
        System.out.printf("结果保留2位小数之后：%s%n", result2);
        // 两个小数相除
        BigDecimal result3 = b1.divide(b2,4, BigDecimal.ROUND_DOWN);
        System.out.printf("%s除以%s等于%s%n", b1, b2, result3);
    }
}
