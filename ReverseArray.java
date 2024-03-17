package com.ankush.dsa;

public class ReverseArray {

    public static void reverse_Array(int numbers[]){

        int start=0, end= numbers.length-1;
        while (start < end){

            int temp =numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        int numbers[] = {21,5,56,74,88,63,12,6,99};

        reverse_Array(numbers);

        for (int i=0 ;i<=numbers.length-1; i++){

            System.out.println(numbers[i]);
        }

    }
}
