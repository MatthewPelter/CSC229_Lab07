/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length; // 1
        //      1        n      n
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) { // n
                return i; // 1
            }
        }
        
        return -1;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
         /*
         // f(n) = 3n + 3
         // Lower bound: Ω(1)
         // Upper bound: O(n)
         f(n) <= c*g(n)
         3n+3 <= 6n
         O(n)
         // Average: θ(n)
        1 <= n <= n
        */
    }
    
}
