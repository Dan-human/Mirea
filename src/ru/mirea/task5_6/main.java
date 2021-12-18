package ru.mirea.task5_6;

import java.util.Scanner;

public class main {
    private static boolean isPrime(int n) {
        return isPrime(n, 2, false);
    }

    private static boolean isPrime(int n, int divisor, boolean flag) {
        if (divisor == n) return true;
        if (n % divisor == 0) return false;
        flag = isPrime(n, ++divisor, flag);
        return flag;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }


}

