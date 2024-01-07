package Loops;

import java.util.Scanner;

public class SumOfFirstNTerms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms : ");
        int n=sc.nextInt();
        System.out.println("The sum of given number of terms are : ");
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
