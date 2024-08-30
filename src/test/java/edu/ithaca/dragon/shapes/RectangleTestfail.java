package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTestfail {
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
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }//add error how to make illigal argument
}
