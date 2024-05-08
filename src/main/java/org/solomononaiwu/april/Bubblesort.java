package org.solomononaiwu.april;

public class Bubblesort {

    public static void main(String[] args) {
        int[] data = {90,-5,45,-90,-1000,1000,3};

        bubblesort(data);

        System.out.println("AFTER SORTING");

        for (int item : data){
            System.out.println(item);
        }
    }

    private static void bubblesort(int[] data){
        for (int lastUnsortedIndex = data.length-1; lastUnsortedIndex >0 ; lastUnsortedIndex--) {
            for (int i = 1; i < data.length; i++) {
                if(data[i] < data[i-1]){
                    swap(data,i-1,i);
                }
            }
        }
    }

    private static void swap(int[] data, int x, int y){
        if(data[x]==data[y]){
            return;
        }
        int temp = data[y];
        data[y] = data[x];
        data[x] = temp;
    }
}
