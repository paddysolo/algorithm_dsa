package org.solomononaiwu.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] data = {90,-15,3,201};

        System.out.println(linearSearch(data,201 ));

    }

    private static int linearSearch(int[] data,int value){
        for (int i = 0; i <data.length ; i++) {
            if(data[i] == value){
                return i;
            }
        }

        return -1;
    }
}
