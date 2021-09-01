/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.firstsummativeassessments;

import java.util.Scanner;

/**
 *
 * @author kavin
 */
public class HealthyHearts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        
        // Receive input, also ensures that it is an integer.
        try {
            System.out.println("What is your age?");
            age = Integer.parseInt(sc.nextLine());
            
            // Ensure that age is non-negative and not more than 150.
            // 150 is an arbitrary number that is a bit higher than age of ~120.
            
            if (age < 0 || age > 150){
                System.out.println("Age is not in the range of 0 to 150!");
                return;
            }
        }
        catch(NumberFormatException e){
            System.out.println("You did not enter a valid integer!");
            return;
        }
        
        int maximumHeartRate = 220 - age;
        
        // Compute target heartrate zone, rounding into the range.
        
        int targetMin = (int) Math.ceil(0.5 * maximumHeartRate);
        int targetMax = (int) Math.floor(0.85 * maximumHeartRate);
        
        System.out.printf("Your maximum heart rate should be %d beats per minute\n", maximumHeartRate);
        System.out.printf("Your target HR Zone is %d - %d beats per minute\n", targetMin, targetMax);
    }
}
