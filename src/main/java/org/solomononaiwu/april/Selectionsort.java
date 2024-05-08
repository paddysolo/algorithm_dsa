package org.solomononaiwu.april;

public class Selectionsort {
    public static void main(String[] args) {
        int[] data = {90,-5,45,-90,-1000,1000,3};

        selectsort(data);

        System.out.println("AFTER SORTING");

        for (int item : data){
            System.out.println(item);
        }
    }

    private static void selectsort(int[] data){
        for(int lastUnsortedIndex = data.length-1; lastUnsortedIndex>0;lastUnsortedIndex--){
            int largestKnownIndex = 0;
            for(int i = 1; i<=lastUnsortedIndex;i++){
                if(data[i]>data[largestKnownIndex]){
                    largestKnownIndex = i;
                }
            }

            swap(data,lastUnsortedIndex,largestKnownIndex);
        }

    }

    private static void swap(int[] data,int x,int y){
        if(data[x] == data[y]){
            return;
        }

        int temp = data[y];
        data[y] = data[x];
        data[x] = temp;
    }


}
