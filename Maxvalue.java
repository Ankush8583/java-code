package com.ankush.dsa;

public class Maxvalue {

    public static int findMax(int value[],int key){
        for (int i=0; i<value.length; i++){
            if (key < value[i]){
                key=value[i];
            }

        }
         return key;
    }
    public static void main(String[] args) {
        int value[]= {10,55,1,88,77,66,99,101,85};
        int key=Integer.MIN_VALUE;
        int num=findMax(value,key);

        System.out.println(num);
    }

}
