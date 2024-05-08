package org.solomononaiwu.bubblesort;

public class BubbleSortDoIt {
    public static void main(String[] args) {
        int[] data = {90,2,35,-20,4,-35};

        for(int lastUnsortedIndex=data.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i = 0;i < lastUnsortedIndex;i++){
                if(data[i]>data[i+1]){
                    swap(data,i,i+1);
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void swap(int[] data,int i , int j){
        if(i==j){
            return;
        }
        int temp = data[i];
        data[i]=data[j];
        data[j]=temp;
    }
}
