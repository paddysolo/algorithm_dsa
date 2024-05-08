package org.solomononaiwu;

public class Main {
    public static void main(String[] args) {
       int[] numbers = new int[5];
       numbers[0] = 90;
       numbers[1]=5;
       numbers[2] = 54;
       numbers[3] = 7;
       numbers[4] = -90;

       for(int i = 0; i<numbers.length ; i++){
           System.out.println("NUM : "+numbers[i]);
       }
    }
}