/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksheet1.pkg1.pkg8;

/**
 *
 * @author NelJoy
 */

public class Tasksheet118{
    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};
        calculateCumulativeSum(numbers);
    }

    public static void calculateCumulativeSum(int... nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = 1; j <= nums[i]; j++) {
                currentSum += j;
            }
            totalSum += currentSum;
            System.out.println("Total sum for parameter " + (i + 1) + ": " + currentSum);
        }
        System.out.println("Total cumulative sum of all parameters: " + totalSum);
    }
}