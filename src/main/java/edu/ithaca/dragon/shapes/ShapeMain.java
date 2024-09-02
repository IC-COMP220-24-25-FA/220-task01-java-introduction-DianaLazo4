package edu.ithaca.dragon.shapes;
import java.util.Random;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        
        Random random = new Random();
        float randomFloatLenght = 1 + random.nextFloat() * 9;
        float randomFloatWidth = 1 + random.nextFloat() * 9; 
        Rectangle rectangle1 = new Rectangle(randomFloatLenght, randomFloatWidth);
        Rectangle rectangle2 = new Rectangle(randomFloatLenght, randomFloatWidth);
        Rectangle rectangle3= new Rectangle(randomFloatLenght, randomFloatWidth);
        Rectangle rectangle4 = new Rectangle(randomFloatLenght, randomFloatWidth);
        Rectangle rectangle5= new Rectangle(randomFloatLenght, randomFloatWidth);
        System.out.println("rectangle1 area:" + rectangle1.calcArea(rectangle1.getlength(), rectangle1.getwidth()));
        System.out.println("rectangle2 area:" + rectangle2.calcArea(rectangle1.getlength(), rectangle1.getwidth()));
        System.out.println("rectangle3 area:" + rectangle3.calcArea(rectangle1.getlength(), rectangle1.getwidth()));
        System.out.println("rectangle4 area:" + rectangle4.calcArea(rectangle1.getlength(), rectangle1.getwidth()));
        System.out.println("rectangle5 area:" + rectangle5.calcArea(rectangle1.getlength(), rectangle1.getwidth()));

    
    
    }   


}
