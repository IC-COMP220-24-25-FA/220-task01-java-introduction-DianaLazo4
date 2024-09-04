package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
         if (first < 0 || second < 0 || third < 0) {
        throw new IllegalArgumentException("All numbers must be non-negative.");
        }

        int high = 0;
        if (first > high){
            high = first;
        }
        if (second > high){
            high = second;
        }
        if (third > high){
            high = third;
        }

        return high;
        
         
        //throw new RuntimeException("Not Implemented");
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    //Going to make saleTax a percent, to multiply the original price to 
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTaxPercent){
        double discountAmount = originalPrice * (discountPercent / 100.0);
        double priceAfterDiscount = originalPrice - discountAmount;
        double salesTaxAmount = priceAfterDiscount * (salesTaxPercent / 100.0);
        double finalSalePrice = priceAfterDiscount + salesTaxAmount;
        return finalSalePrice;

    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (yearsOld >= 0 && daysSinceShoesChewed >= 7 && fetchedThePaperToday == true) {
        return true;  
        } else {
        return false; 
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.isEmpty()) {
            return -1; 
        }
    
        int largestIndex = 0;  
        int largestValue = numbers.get(0);  // Initialize the largest value with the first element
    
        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber > largestValue) {
                largestValue = currentNumber;  // Update the largest value
                largestIndex = i;  // Update the index of the largest value
            }
        }
    
        return largestIndex; 
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.isEmpty()) {
            return -1; 
        }
    
        int largestIndex = 0;  
        int largestValue = numbers.get(0);  // Initialize the largest value with the first element
    
        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber >= largestValue) { //Now => so the last occurence index is returned
                largestValue = currentNumber;  // Update the largest value
                largestIndex = i;  // Update the index of the largest value
            }
        }
    
        return largestIndex; 
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
