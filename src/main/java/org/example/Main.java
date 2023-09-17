package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("input.txt"));
        int n = in.nextInt();

        BigInteger res = factorial(n);

        PrintWriter out = new PrintWriter("output.txt");
        int result = checkZeros(res);

        out.println(result);
        out.close();

    }

    public static int checkZeros (BigInteger f){
        int counter = 0;

        String input = String.valueOf(f);
        for (int i = input.length() - 1; i > 0 ; i--) {
            if (input.charAt(i) == '0') {
                counter++;
            } else {
                return counter;
            }
        }

        return counter;
    }

    public static BigInteger factorial (int n){
        BigInteger factorial = BigInteger.ONE;
        if (n == 1) return factorial;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

}