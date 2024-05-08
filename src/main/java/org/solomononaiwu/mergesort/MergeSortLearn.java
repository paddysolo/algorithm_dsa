package org.solomononaiwu.mergesort;

public class MergeSortLearn {
    public static void main(String[] args) {
        int[] data = {89,900,70,-20,1,55,-23,755,-100};

        mergeSort(data,0,data.length);

        for (int item : data){
            System.out.println(item);
        }
    }

    private static void  mergeSort(int[] data,int start,int end){
        if(end-start < 2){
            return;
        }
        int mid = (end+start)/2;
        mergeSort(data,start,mid);
        mergeSort(data,mid,end);
        merge(data,start,mid,end);
    }

    //we always merge sorted partition - a 1 element array is always sorted.
    private static void merge(int[] data,int start,int mid,int end){
      if(data[mid-1] <= data[mid]){
          return;
      }

      int i = start;
      int j = mid;
      int tempIndex = 0;
      int[] temp = new int[end-start];

      while (i<mid && j <end){
          temp[tempIndex++] = data[i]<=data[j]?data[i++]:data[j++];
      }

      System.arraycopy(data,i,data, start+tempIndex,mid-i);
      System.arraycopy(temp,0,data,start,tempIndex);

    }
}


