package org.solomononaiwu.allsort;

public class AllSort {
    public static void main(String[] args) {
        int[] data = {89,900,70,-20,1,55,-23,755,-100};

//        bubblesort(data);
//        selectionSort(data);
        insertionSort(data);

        for(int item: data){
            System.out.println(item);
        }
    }

    public static void bubblesort(int[] data){
        System.out.println("BUBBLE SORT");
        for (int lastUnsortedIndex = data.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i = 0;i<lastUnsortedIndex;i++){
                if(data[i]>data[i+1]){
                    swap(data,i,i+1);
                }
            }
        }
    }

    public static void selectionSort(int[] data){
        System.out.println("SELECTION SORT");
        for (int lastUnsortedIndex = data.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            int largestKnownIndex = 0;
            for (int i = 1;i<=lastUnsortedIndex;i++){
                if(data[i]>data[largestKnownIndex]){
                    largestKnownIndex = i;
                }
            }
            swap(data,largestKnownIndex,lastUnsortedIndex);
        }
    }

    public static void insertionSort(int[] data){
        System.out.println("INSERTION SORT");

        for (int firstUnsortedIndex = 1; firstUnsortedIndex<data.length;firstUnsortedIndex++){
            int newElement = data[firstUnsortedIndex];
            int i;

            for (i=firstUnsortedIndex;i>0 && data[i-1]>newElement;i--){
                data[i] = data[i-1];
            }

            data[i] = newElement;
        }
    }




    private static void swap(int[] data, int i, int j){
        if(i==j){
            return;
        }
        int temp = data[i];
        data[i]= data[j];
        data[j] = temp;
    }
}
