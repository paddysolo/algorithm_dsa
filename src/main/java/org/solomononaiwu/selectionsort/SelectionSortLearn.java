package org.solomononaiwu.selectionsort;


//BY HEART
public class SelectionSortLearn {
    public static void main(String[] args) {

        int[] data = {1,20,-8,90,-300,2,-900,45,-9000};

        for (int lastUnsortedIndex=data.length-1; lastUnsortedIndex >0; lastUnsortedIndex--){
            int largestKnownIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(data[i] > data[largestKnownIndex]){
                    largestKnownIndex = i;
                }
            }
            swap(data,largestKnownIndex,lastUnsortedIndex);
        }

        for (int item : data) {
            System.out.println(item);
        }
    }

    private static void swap(int[] data,int i,int j){
        if(i==j){
            return;
        }
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
