package org.solomononaiwu.bubblesort;

public class BubbleSortDoit2 {
    public static void main(String[] args) {
        int[] data = {1,20,-8,90,-300,2,-900};
        for(int lastUnsortedIndex = data.length-1;lastUnsortedIndex>0;lastUnsortedIndex-- ){
            for (int i = 0; i<lastUnsortedIndex ; i++){
                if(data[i]>data[i+1]){
                    swap(data,i,i+1);
                }
            }
        }

        for(int item : data){
            System.out.println(item);
        }
    }

    private static void swap(int[] data,int i,int j){
        if(i == j){
            return;
        }
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
