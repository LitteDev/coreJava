package com.java.coreJava.chapter01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Core Java 10!");
        OperatorNumber operator = new OperatorNumber();
        double number1 = 0.0;
        double number2 = 0.0;

        System.out.println("1 + 2 = " + operator.sum(1, 2));
    }
}