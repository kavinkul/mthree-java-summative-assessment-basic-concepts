/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.firstsummativeassessments;

/**
 *
 * @author kavin
 */
public class SummativeSums {
    public static void main(String[] args){
        // Three sample arrays from exercise.
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 } ;

        // Expected Results : 42, 1337, 2001

        System.out.println("#1 Array Sum: " + arraySum(array1));
        System.out.println("#2 Array Sum: " + arraySum(array2));
        System.out.println("#3 Array Sum: " + arraySum(array3));
    }
    
    // Function for calculating sum. Using for-each loop on arr and add to sum one by one
    
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int number : arr)
            sum += number;
        return sum;
    }
}
