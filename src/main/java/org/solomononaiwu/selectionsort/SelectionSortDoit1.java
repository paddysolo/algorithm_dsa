package org.solomononaiwu.selectionsort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelectionSortDoit1 {
    public static void main(String[] args) {
        int[] data = {1000,-20,34,-900,3,1,-8000};
        for (int lastUnsortedIndex = data.length-1; lastUnsortedIndex >0 ; lastUnsortedIndex--) {
            int largestKnownIndex = 0;
            for (int i = 1;i<=lastUnsortedIndex;i++){
                if(data[i]>data[largestKnownIndex]){
                    largestKnownIndex = i;
                }
            }
            swap(data,largestKnownIndex,lastUnsortedIndex);
        }

        System.out.println(IntStream.of(data).boxed().collect(Collectors.toList()));
    }
    private static void swap(int[] data, int i ,int j){
        if(i == j){
            return;
        }
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
