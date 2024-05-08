package org.solomononaiwu.algoritm_patterns.sliding_window;

public class SlidingWindow {
    public static void main(String[] args) {
//        System.out.println(maxSumOfContigentSubArrayOfSize(new int[]{1,2,4,2,30,11,5,0},3));
        System.out.println(minimumSubArraySizeWithGivenNum(new int[]{4,2,2,7,8,1,2,8,10},8));
    }



    //static varient
    public static int maxSumOfContigentSubArrayOfSize(int[] data,int k){
        int maxSum = Integer.MIN_VALUE;
        int currentRuningSum = 0;
        for(int i=0; i<data.length; i++){
            currentRuningSum+=data[i];
            if(i>=k-1){
                maxSum = Math.max(maxSum,currentRuningSum);
                currentRuningSum-=data[i-(k-1)];
            }
        }
        return maxSum;
    }

    //dynamic varient
    //smallest subarray sum with size >= k
    public static int minimumSubArraySizeWithGivenNum(int[] nums,int k){
        //grow and shrink
        int windowStart = 0;
        int currentWindowSize = 0;
        int minArraySize = Integer.MAX_VALUE;

        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            currentWindowSize+=nums[windowEnd];
            while(currentWindowSize>=k){
                minArraySize = Math.min(minArraySize,(windowEnd-windowStart + 1));
                currentWindowSize-=nums[windowStart];
                windowStart++;
            }
        }
        return minArraySize;
    }
}
