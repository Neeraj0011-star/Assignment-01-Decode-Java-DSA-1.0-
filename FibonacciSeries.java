package EXTRA;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter terms : ");
        int n=sc.nextInt();
        System.out.print("Fibonacci Series are : ");
        int a=0,b=1,c=0;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
