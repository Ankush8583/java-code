package com.ankush.dsa;

public class Maxsubarraykadane {
    public static void main(String[] args) {

       int num[] ={-2,-3,4,-1,-2,1,5,-3};

       int maxSum=Integer.MIN_VALUE;
       int currentSum=0;

       for (int i=0; i< num.length; i++){

           currentSum = currentSum+num[i];
           if (currentSum < 0){
               currentSum = 0;
           }
           maxSum = Math.max(currentSum,maxSum);


       }

        System.out.println("Our max sub array is : " + maxSum);
    }
}
