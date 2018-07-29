package com.java.coreJava.chapter01;

/**
 * 数字的运算
 *
 * 和 sum
 * 差 difference
 * 积 product
 * 商 quotient
 */
public class OperatorNumber {

    /**
     * 求两个数的和
     *
     * @param number1
     * @param number2
     * @return
     */
    public double sum(double number1, double number2) {
        return number1 + number2;
    }

    /**
     * 求两个数的差
     *
     * @param number1
     * @param number2
     * @return
     */
    public double difference(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * 求两个数的乘积
     *
     * @param number1
     * @param number2
     * @return
     */
    public double product(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * 求两个数的商
     *
     * @param number1
     * @param number2
     * @return
     */
    public double quotient(double number1, double number2) throws Exception {
        if (number2 != 0.0) {
            return number1 / number2;
        } else {
            throw new Exception("除数不能为0！");
        }
    }
}
