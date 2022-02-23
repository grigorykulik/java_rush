package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger result;

        if (n == 0) {
            result = BigInteger.ONE;
        } else if (n < 0) {
            result = BigInteger.ZERO;
        } else {
            result = BigInteger.ONE;
            while (n > 1) {
                result = result.multiply(BigInteger.valueOf(n--));
            }
        }

        return String.valueOf(result);
    }
}
