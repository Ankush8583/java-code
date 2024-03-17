package com.ankush.dsa;

import java.util.Scanner;

public class Linersearch {

    public static int liner(int number[], int key) {

        for (int i = 0; i < number.length; i++) {

            if (number[i] == key) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]= {26,33,0,44,5,6,8,99,45,7,77};
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter any key to find");
        int key = sc.nextInt();


     int index =liner(number,key);
        System.out.println(index);

    }
}
