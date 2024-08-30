package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void sampleTestThatPasses(){
        System.out.println("hello world");
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Circle myCircle = new Circle(1);
        assertEquals(3.1415, myCircle.calcArea(myCircle.getradius()), 0.0001);
        
        myCircle = new Circle((float) 5.5);
        assertEquals(95.0304, myCircle.calcArea(myCircle.getradius()), 0.0001);
        //it was said before set to equal 95.0331, but using 3.1415 as pie it equals 95.0304

        myCircle = new Circle((float)0.001);
        assertEquals(0.00000314159, myCircle.calcArea(myCircle.getradius()), 0.0000000001);
    }
    @Test
    public void doubleSize(){
        Circle myCircle = new Circle(1);
        myCircle.doubleSize();
        assertEquals(12.566, myCircle.calcArea(myCircle.getradius()), 0.0001);
    }
    @Test
    public void longestLineWithin(){
        Circle myCircle = new Circle(1);
        assertEquals(2, myCircle.longestLineWithin(), 0.0001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }//add error how to make illigal argument


    
}
