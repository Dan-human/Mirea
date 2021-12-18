package ru.mirea.task5_5;

import java.util.Scanner;

public class main
{
    public static void countSum(int n) {countSum(n, 0);}
    public static void countSum(int n, int sum)
    {
        if (n == 0) System.out.println(sum);
        else
        {
            sum += n%10;
            countSum(n/10, sum);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        countSum(n);
    }

}