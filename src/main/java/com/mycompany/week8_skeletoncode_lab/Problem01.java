/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) { // n
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        int sum = 0; // 1
        boolean isPrime = true; // 1
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // another for loop n
                sum += i; // n
            }
        }
        
        return sum; // 1
    }
    
    /*
    Two nested for loops
    O(n^2)
    
    Space:
    O(1) constant
    */
    
    public static void main(String[] args) {
        System.out.println(getSumOfPrimes(11));
    }
}
