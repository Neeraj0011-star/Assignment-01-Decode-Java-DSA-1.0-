package Loops;

import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        System.out.println("Table of "+n+" is : ");
        int i;
        for(i=n ; i<=n*10 ;i++) {
            if(i%n==0) System.out.println(i);
        }
    }
}
