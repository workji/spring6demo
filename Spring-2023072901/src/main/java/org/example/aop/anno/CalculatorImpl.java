package org.example.aop.anno;

import org.springframework.stereotype.Component;

//基本实现类
@Component
public class CalculatorImpl implements Calculator {

    @Override
    public int add(int i, int j) {

        int result = i + j;

        System.out.println("Method Inner result = " + result);

        //为了测试，模拟异常出现
       // int a = 1/0;
        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;

        System.out.println("Method Inner result = " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;

        System.out.println("Method Inner result = " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;

        System.out.println("Method Inner result = " + result);

        return result;
    }
}
