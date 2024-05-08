package org.solomononaiwu.challenges;

import java.util.Arrays;

public class MergeSortInDescendingOrder {
    public static void main(String[] args) {
//        int[] data = {89,900,70,-20,1,55,-23,755,-100};
        int[] data = {30,20,60};

        mergeSortD(data,0,data.length);

        for (int item : data){
            System.out.println(item);
        }
    }

    private static void mergeSortD(int[] data,int start,int end){
        if(end-start < 2){
            return;
        }
        int mid = (end+start)/2;
        mergeSortD(data,start,mid);
        mergeSortD(data,mid,end);
        mergeDesceding(data,start,mid,end);
    }

    //{30,45} , {20,60}
    // [ 60,45,30,20]
    //60,50,45,30
    //60,45,30,20

    private static void mergeDesceding(int[] data,int start,int mid,int end){
        if(data[mid-1]<= data[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempLastIndex = end-start-1;

        int[] temp = new int[end-start];

        //{30,45} , {20,60}
        //[  30,20]
        // [ 60,45,30,20]
        //60,50,45,30
        //60,45,30,20

        while ( i<mid && j<end){
            temp[tempLastIndex--] = data[i] <= data[j]? data[i++] : data[j++];
        }

        System.out.println("TEMP");
        System.out.println(Arrays.toString(temp));
        System.out.println("DATA");
        System.out.println(Arrays.toString(data));

        System.arraycopy(data,j,data,0,end-j);
//        System.arraycopy(temp,0,data,j,mid-i);


        System.out.println("TEMP");
        System.out.println(Arrays.toString(temp));
        System.out.println("DATA");
        System.out.println(Arrays.toString(data));


    }
}
