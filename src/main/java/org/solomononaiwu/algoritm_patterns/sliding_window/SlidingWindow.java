package org.solomononaiwu.algoritm_patterns.sliding_window;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SlidingWindow {
    public static void main(String[] args) {
//        System.out.println(maxSumOfContigentSubArrayOfSize(new int[]{1,2,4,2,30,11,5,0},3));
//        System.out.println(minimumSubArraySizeWithGivenNum(new int[]{4,2,2,7,8,1,2,8,10},8));

        System.out.println(longestSubStringKDistictCharacters("AAHHHIBC",2));
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
    //smallest subarray size with sum  >= k
    public static int minimumSubArraySizeWithGivenNum(int[] nums,int k){
        //grow and shrink
        int windowStart = 0;
        int currentWindowSum = 0;
        int minArraySize = Integer.MAX_VALUE;

        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            currentWindowSum+=nums[windowEnd];
            while(currentWindowSum>=k){
                minArraySize = Math.min(minArraySize,(windowEnd-windowStart + 1));
                currentWindowSum-=nums[windowStart];
                windowStart++;
            }
        }
        return minArraySize;
    }

    //Longest Substring Length With K Distinct Characters
    // example - AAHHHIBC
    public static int longestSubStringKDistictCharacters(String s,int k){
        int ls = 0;

        Map<Character,Integer> hs = new HashMap<>();
        for(int windowEnd = 0; windowEnd<s.length();windowEnd++){
            while(hs.size()<k){

            }
        }

        return ls;
    }

    public static int getMapSum(Map<Character,Integer> data){
        return data.values().stream().mapToInt(d->d).sum();
    }

}
