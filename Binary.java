package com.ankush.dsa;

public class Binary {

        public static int findKey(int number[], int key){

            int start=0, end= number.length-1;

            while (start <= end){
                int mid = (start+end)/2;
           //     System.out.println(mid);

                if (number[mid] == key){
                    return mid;
                }
                if (mid > key){
                    end = mid-1;
                }else {
                    start = mid+1;
                }

            }
              return  -1;
        }


    public static void main(String[] args) {

        int number[]= {2,6,8,9,44,55,66,99,111,222};
        int key=44;

        System.out.println(findKey(number,key));
       // System.out.println(find);

        System.out.println("=======");
    }
}
