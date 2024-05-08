package org.solomononaiwu.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    private static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial(num-1);
    }
}

//when n= 0 return 1
//when n =1 -- 1*0!
// when n=2 -- 2*1!
//when n=3 -- 3*2!