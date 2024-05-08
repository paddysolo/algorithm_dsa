package org.solomononaiwu.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {-100,-40,3,90,893,1000,9000};
//        System.out.println(binarySearchIterative(data,1000));
        System.out.println(binarySearchRecursive(data,893));
    }


    public static int binarySearchIterative(int[] data,int value){

        int start = 0;
        int end = data.length;

        while (start<end){
            int midpoint = (start+end)/2;
            if(data[midpoint] == value){
                return midpoint;
            } else if (data[midpoint] < value){
                //check right
                start = midpoint+1;
            } else {
                //check left
                end = midpoint;
            }
        }

        return -1;

    }


    public static int binarySearchRecursive(int[] data, int value){
        int start = 0;
        int end = data.length;
        return binarySearchRecursive(data,value,start,end);
    }

    public static int binarySearchRecursive(int[] data, int value,int start,int end){

        if(start>=end){
            return -1;
        }

        int midpoint = (start+end)/2;

        if(data[midpoint] == value){
            return midpoint;
        } else if (data[midpoint]<value ){
            //check right
           return binarySearchRecursive(data,value,midpoint+1,end);
        } else {
            //check left
            return binarySearchRecursive(data,value,start,midpoint);
        }

    }

}
