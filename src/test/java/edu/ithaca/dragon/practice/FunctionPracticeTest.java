package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        //the first three use the same 3 numbers but in different indexes to make sure 
        //the code can go through each attrible and select the  largest, no matter order
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));
        //makes sure if all are the same or more than one, it still puts out the the largest even if its multiple
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
        //these three make sure that any negative in any attribute gives an error
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(1.89, FunctionPractice.calcSalePrice(2,10, 5),0.01);
        assertEquals(4.73, FunctionPractice.calcSalePrice(5,10, 5),0.01);

    }
    @Test
    public void isGoodDogTest(){
        assertTrue(FunctionPractice.isGoodDog(1, 10, true));
        assertFalse(FunctionPractice.isGoodDog(5, 1, true));
        assertFalse(FunctionPractice.isGoodDog(-1, 10, true));
        assertFalse(FunctionPractice.isGoodDog(1, 10, false));

    }
    @Test
    public void findFirstLargest(){
        List<Integer> numbers = Arrays.asList(1, 10, 5, 10, 9);
        assertEquals(1, FunctionPractice.findFirstLargest(numbers));
        numbers = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals(4, FunctionPractice.findFirstLargest(numbers));
        List<Integer> num = Arrays.asList();
        assertEquals(-1, FunctionPractice.findFirstLargest(num));

    }
    @Test
    public void findLastLargest(){
        List<Integer> numbers = Arrays.asList(1, 10, 5, 10, 9);
        assertEquals(3, FunctionPractice.findLastLargest(numbers));
        numbers = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals(4, FunctionPractice.findLastLargest(numbers));
        List<Integer> num = Arrays.asList();
        assertEquals(-1, FunctionPractice.findLastLargest(num));

    }
    @Test
    public void findFirstMostOccurencesOfLetter(){
        List<String> words = Arrays.asList("pizza", "pizzza","zebra");
        assertEquals("pizzza", FunctionPractice.findFirstMostOccurencesOfLetter(words,'z'));
        words = Arrays.asList("pizzzza", "pizzza","zebra");
        assertEquals("pizzzza", FunctionPractice.findFirstMostOccurencesOfLetter(words,'z'));
        words = Arrays.asList("pizza", "pizzza","pizzzza");
        assertEquals("pizzzza", FunctionPractice.findFirstMostOccurencesOfLetter(words,'z'));
        words = Arrays.asList();
        assertEquals("-1", FunctionPractice.findFirstMostOccurencesOfLetter(words,'z'));

    }
}
