package org.solomononaiwu.bubblesort;

public class BubleSortDoit3 {
    public static void main(String[] args) {
        int[] data = {2,-90,889,23,-10,90,-2000,98};

        for (int lastUnsortedIndex = data.length-1; lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i = 0; i <lastUnsortedIndex;i++){
                if(data[i]>data[i+1]){
                    swap(data,i,i+1);
                }
            }
        }

        for(int item : data){
            System.out.println(item);
        }
    }
    private static void swap(int[] data,int  i,int j){
        if(i==j){
            return;
        }
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
