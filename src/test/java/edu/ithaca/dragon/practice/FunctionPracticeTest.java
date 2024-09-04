package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

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
        fail("Not implemented yet");
    }
    
}
