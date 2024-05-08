package org.solomononaiwu.insertionsort;

public class InsertionSortLearn {
    public static void main(String[] args) {
        int[] data = {1000,-20,34,-900,3,1,-8000};

        for(int firstUnsortedIndex = 1;firstUnsortedIndex<data.length;firstUnsortedIndex++){
            int newElement = data[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0 && data[i-1] > newElement;i--){
                data[i] = data[i-1];
            }
            data[i] = newElement;
        }

        for (int item: data){
            System.out.println(item);
        }
    }
}
