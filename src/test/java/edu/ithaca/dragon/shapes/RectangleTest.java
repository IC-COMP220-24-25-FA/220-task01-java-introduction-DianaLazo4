package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    
    @Test
    public void sampleTestThatPasses(){
        System.out.println("hello world");
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(2,1);
        assertEquals(2, myRectangle.calcArea(myRectangle.getlength(),myRectangle.getwidth()), 0.0001);
        
        myRectangle = new Rectangle(3,2);
        assertEquals(6, myRectangle.calcArea(myRectangle.getlength(),myRectangle.getwidth()), 0.0001);

        myRectangle = new Rectangle(6,2);
        assertEquals(12, myRectangle.calcArea(myRectangle.getlength(),myRectangle.getwidth()), 0.0001);
    }
    @Test
    public void doubleSize(){
        Rectangle myRectangle = new Rectangle(2,3);
        myRectangle.doubleSize();
        assertEquals(24, myRectangle.calcArea(myRectangle.getlength(),myRectangle.getwidth()), 0.0001);
    }
    @Test
    public void longestLineWithin(){
        Rectangle mRectangle = new Rectangle(1,2);
        assertEquals(2.2361, mRectangle.longestLineWithin(), 0.0001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,0));
    }//add error how to make illigal argument
}
