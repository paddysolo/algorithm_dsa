package org.solomononaiwu.selectionsort;

public class SelectionSortDoit2 {
    public static void main(String[] args) {
        int[] data = {2,-90,889,23,-10,90,-2000,98,0};

        for (int lastUnsortedIndex = data.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largestKnownIndex = 0;
            for (int i =1;i<=lastUnsortedIndex;i++){
                if(data[i]>data[largestKnownIndex]){
                    largestKnownIndex = i;
                }
            }
            swap(data,lastUnsortedIndex,largestKnownIndex);
        }

        System.out.println("SELECTION SORT");
        for (int item : data) {
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
