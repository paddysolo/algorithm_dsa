package org.solomononaiwu.challenges;

public class SelfQuestion {
    public static void main(String[] args) {
        //given an array , that when divided, each divided  partition is sorted already.
        // sort this array into a single array.
        int[] data = {10,24,89,30,45,100};

        int mid = (data.length)/2;
        merge(data,0,mid,data.length);

        for (int item : data){
            System.out.println(item);
        }
    }

    private static void merge(int[] data,int start,int mid,int end){

        if(data[mid-1]<=data[mid]){
            return;
        }

        int  i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end-start];

        while (i<mid && j < end ){
            temp[tempIndex++] = data[i]<=data[j] ? data[i++] : data[j++];
        }

        System.arraycopy(data,i,data,start+tempIndex,mid-i);
        System.arraycopy(temp,0,data,start,tempIndex);
    }
}
