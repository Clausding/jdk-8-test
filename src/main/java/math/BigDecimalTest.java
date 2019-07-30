package math;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class BigDecimalTest {
    public static void main(String[] args) {
        m3();
    }

    /**
     * 加减乘除
     */
    static void m3() {
        BigDecimal bigNum = new BigDecimal("100");
        BigDecimal divisor = new BigDecimal("2");
        BigDecimal result = bigNum.divide(divisor,4, BigDecimal.ROUND_DOWN);
        System.out.println(result);
    }

    /**
     * 保留限定小数位数
     */
    static void m2() {
        BigDecimal result;
        BigDecimal bigNum = new BigDecimal("1.355");

        result = bigNum.setScale(2,BigDecimal.ROUND_DOWN);
        System.out.println(result);

        result = bigNum.setScale(2,BigDecimal.ROUND_UP);
        System.out.println(result);

        result = bigNum.setScale(2,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(result);

        result = bigNum.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(result);
    }

    /**
     * 格式化
     */
    static void m1() {
        // 本金
        BigDecimal bigLoanAmount = new BigDecimal("523.12");
        // 利率
        BigDecimal bigInterestRate = new BigDecimal("0.0265123");
        // 利息
        BigDecimal bigInterest = bigLoanAmount.multiply(bigInterestRate);
        // 本地货币格式
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // 本地百分比格式
        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMaximumFractionDigits(3);
        // 打印
        System.out.println("贷款本金:\t" + currency.format(bigLoanAmount));
        System.out.println("利率:\t" + percent.format(bigInterestRate));
        System.out.println("利息:\t" + currency.format(bigInterest));
    }
}
