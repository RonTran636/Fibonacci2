package com.example.practicenumberone;

public class Main {

    public static void main(String[] args) {
//        int[] intArray = {20,35,-15,7,55,1,-22};
//        for (int gap = intArray.length/2;gap>0;gap/=2)
//            for (int i =gap;i<intArray.length;i++){
//                int newElement = intArray[i];
//                int j=i;
//                while (j>=gap && intArray[j-gap]>newElement){
//                    intArray[j]=intArray[j-gap];
//                    j-=gap;
//                }
//                    intArray[j]=newElement;
//            }
//        for (int value : intArray) System.out.println(value);
        System.out.println(finonacci(20));
    }

   public static int finonacci( int n){
        switch (n){
            case 1: return 4;
            case 2: return 7;
            case 3: return 5;
            default: return finonacci(n-1)+finonacci(n-2)+finonacci(n-3);
        }

   }
}

