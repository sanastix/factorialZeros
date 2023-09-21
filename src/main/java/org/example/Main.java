package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");

        int n = Integer.parseInt(in.readLine());

        int result = countTrailingZeros(n);

        out.println(result);
        in.close();
        out.close();
    }

    public static int countTrailingZeros(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
