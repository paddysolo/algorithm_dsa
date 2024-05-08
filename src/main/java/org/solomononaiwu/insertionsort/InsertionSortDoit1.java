package org.solomononaiwu.insertionsort;

public class InsertionSortDoit1 {
    public static void main(String[] args) {
        int[] data = {2,-90,889,23,-10,90,-2000};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex<data.length;firstUnsortedIndex++){
            int newElement = data[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0&& data[i-1]>newElement;i--){
                data[i] = data[i-1];
            }
            data[i] = newElement;
        }

        for (int item : data){
            System.out.println(item);
        }
    }
}
