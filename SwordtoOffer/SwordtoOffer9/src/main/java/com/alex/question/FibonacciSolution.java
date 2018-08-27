package com.alex.question;

public class FibonacciSolution {

    public long fibonacci(int n){
        long[] results= new long[n+1] ;
        if(n==0){
            return 1;
        }
        if(n==1){
            return 2;
        }
        results[0]=1;
        results[1]=2;
        for(int i=2;i<=n+1;i++){
            results[i]=results[i-1]+results[i-2];
        }
        return results[n];
    }

}
