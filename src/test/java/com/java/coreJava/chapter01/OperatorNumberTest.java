package com.java.coreJava.chapter01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorNumberTest {

    private OperatorNumber operator;

    @Before
    public void setUp() throws Exception {
        operator = new OperatorNumber();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() throws Exception {
        double result = operator.sum(1, 3);
        Assert.assertEquals(3.0, 1, 2);
    }

    @Test
    public void difference() throws Exception {
        double result = operator.difference(101.01, 20.5);
        Assert.assertEquals(80.51, 101.01, 20.5);
    }

    @Test
    public void product() throws Exception {
        Double result = operator.product(6, 8);
        Double expNot = 24.0d;
        Double exp = 48.0d;
        Assert.assertNotEquals(expNot, result);
        Assert.assertEquals(exp, result);
    }

    @Test
    public void quotient() throws Exception {
        Double result = operator.quotient(3, 5);
        Double expNot = 3.0d;
        Double exp = 0.6d;

        Assert.assertNotEquals(expNot, result);
        Assert.assertEquals(exp, result);

        try {
            Assert.assertNotEquals(0.0, operator.quotient(3, 0));
        }catch (Exception e){
            System.out.println("3/0没有意义");
        }
    }

}