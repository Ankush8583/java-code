package com.ankush.dsa;

import java.util.Scanner;

public class Arrays {

    public static void main(String args[]){

        int marks[] = new int [100];
        System.out.println(marks.length);

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter marks : ");

        marks[5]=sc.nextInt();
        System.out.println(marks[5]);
    }
}
