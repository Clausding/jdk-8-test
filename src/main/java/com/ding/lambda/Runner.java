package com.ding.lambda;

import java.math.BigDecimal;

/**
 * lambda的用途：简化接口的实现方法的写法
 */
public class Runner {
    public static void main(String args[]){
        final int year = 2019;
        Person farmer = (String name, BigDecimal money) -> System.out.printf("%s投资了%s年定期存款%s元%n", name, year, money);
        Person businessman = (String name, BigDecimal money) -> System.out.printf("%s投资了%s年苹果股票%s元%n", name, year, money);
        farmer.invest("二大爷", new BigDecimal("150000.00"));
        businessman.invest("小黑", new BigDecimal("1500.00"));
    }

    interface  Person{
        void invest(String name, BigDecimal money);
    }

}
