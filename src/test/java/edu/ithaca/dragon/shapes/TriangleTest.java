package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    
    @Test
    public void sampleTestThatPasses(){
        System.out.println("hello world");
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    @Test
    public void calcAreaTest(){
        Triangle mTriangle = new Triangle(2,1);
        assertEquals(1.0, mTriangle.calcArea(mTriangle.getbase(),mTriangle.getheight()), 0.0001);
        
        mTriangle = new Triangle(3,2);
        assertEquals(3, mTriangle.calcArea(mTriangle.getbase(),mTriangle.getheight()), 0.0001);
        
        mTriangle = new Triangle(4,5);
        assertEquals(10, mTriangle.calcArea(mTriangle.getbase(),mTriangle.getheight()), 0.0001);
    }
    @Test
    public void doubleSize(){
        Triangle myTriangle = new Triangle(2,1);
        myTriangle.doubleSize();
        assertEquals(1, myTriangle.calcArea(myTriangle.getbase(),myTriangle.getheight()), 0.0001);
    }
    @Test
    public void longestLineWithin(){
        Triangle myTriangle = new Triangle(2,1);
        assertEquals(2.2361, myTriangle.longestLineWithin(), 0.0001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,0));
    }//add error how to make illigal argument
}
