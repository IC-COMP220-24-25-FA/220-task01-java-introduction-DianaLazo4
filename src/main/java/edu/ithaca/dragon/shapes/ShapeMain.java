package edu.ithaca.dragon.shapes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){
        List<InterfaceShapes> shapelist = new ArrayList<>();
        List<String> possib = Arrays.asList("a","b","c");

         for (int r = 0; r < 10; r++){
            String possibletter = possib.get(new Random().nextInt(possib.size()));
            if (possibletter == "a"){
                Random random = new Random();
                float randomFloatLenght = 1 + random.nextFloat() * 9;
                float randomFloatWidth = 1 + random.nextFloat() * 9; 
                Rectangle rectangle = new Rectangle(randomFloatLenght, randomFloatWidth);
                shapelist.add(rectangle);
                
            }
            if (possibletter == "b"){
                Random random = new Random();
                float randomFloatRadius = 1 + random.nextFloat() * 9;
                Circle circle = new Circle(randomFloatRadius);
                shapelist.add(circle);
            }
            if (possibletter == "c"){
                Random random = new Random();
                float randomFloatBase = 1 + random.nextFloat() * 9;
                float randomFloatHeight = 1 + random.nextFloat() * 9; 
                Triangle triangle = new Triangle(randomFloatBase,randomFloatHeight);
                shapelist.add(triangle);
            }

         }

        System.out.println("10 RANDOM SHAPES");
        for (int e = 0; e < shapelist.size(); e++){
            System.out.println(shapelist.get(e).toString());
            
        }
        System.out.println("10 RANDOM SHAPES DOUBLED");
        for (int p = 0; p < shapelist.size(); p++) {
            shapelist.get(p).doubleSize();
            System.err.println(shapelist.get(p).toString());
        }
        //}
        //for (int i = 0; i < shapelist.size(); i++){
            //shapelist.
            //System.out.println(shapelist.get(i));
        //}
        
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        
        Random random = new Random();
        float randomFloatLenght = 1 + random.nextFloat() * 9;
        float randomFloatWidth = 1 + random.nextFloat() * 9; 
        Rectangle rectangle1 = new Rectangle(randomFloatLenght, randomFloatWidth);
        randomFloatLenght = 1 + random.nextFloat() * 9;
        randomFloatWidth = 1 + random.nextFloat() * 9; 
        Rectangle rectangle2 = new Rectangle(randomFloatLenght, randomFloatWidth);
        randomFloatLenght = 1 + random.nextFloat() * 9;
        randomFloatWidth = 1 + random.nextFloat() * 9; 
        Rectangle rectangle3= new Rectangle(randomFloatLenght, randomFloatWidth);
        randomFloatLenght = 1 + random.nextFloat() * 9;
        randomFloatWidth = 1 + random.nextFloat() * 9; 
        Rectangle rectangle4 = new Rectangle(randomFloatLenght, randomFloatWidth);
        randomFloatLenght = 1 + random.nextFloat() * 9;
        randomFloatWidth = 1 + random.nextFloat() * 9; 
        Rectangle rectangle5= new Rectangle(randomFloatLenght, randomFloatWidth);
        List<Rectangle> listrectangle = new ArrayList<Rectangle>();
        listrectangle.add(rectangle1);
        listrectangle.add(rectangle2);
        listrectangle.add(rectangle3);
        listrectangle.add(rectangle4);
        listrectangle.add(rectangle5);

        Scanner myObj = new Scanner(System.in);
        for (int j = 0; j < 5; j++) {
            int time = j + 1;
            System.out.println("PROCESS TURN:"+ time);
            //will count the 5 times, so first will be 1 and last will be the 5 time
            for (int i = 0; i < listrectangle.size(); i++) {
                Rectangle rect = listrectangle.get(i);
                System.out.println("Rectangle " + (i + 1) + " - Length: " + rect.getlength() + ", Width: " + rect.getwidth());
                System.out.println("Area: " + rect.calcArea(rect.getlength(), rect.getwidth()));
                System.out.println("Largest line within: " + rect.longestLineWithin());
            }
            System.out.println("Enter # 1-5 of the rectangle to double the size");
    
            int number = myObj.nextInt();  // Read user input
            System.out.println("Rectangle Chosen is: " + number);  // Output user input
            // Allow the user to choose one rectangle to double its size
            if (number >= 1 && number <= 5) {
            Rectangle chosenRect = listrectangle.get(number - 1);
            chosenRect.doubleSize();  // Double the size of the chosen rectangle
            System.out.println("Rectangle " + number + " has been doubled in size.");
            }   
            else {
            System.out.println("Invalid choice. Try Again");
            }
        }
        myObj.close();

        // After 5 iterations, print the final state of all rectangles
        System.out.println("\nFinal state of rectangles:");
        for (int i = 0; i < listrectangle.size(); i++) {
            Rectangle rect = listrectangle.get(i);
            System.out.println("Rectangle " + (i + 1) + " - Length: " + rect.getlength() + ", Width: " + rect.getwidth());
            System.out.println("Area: " + rect.calcArea(rect.getlength(), rect.getwidth()));
            System.out.println("Largest line within: " + rect.longestLineWithin());
        }
    
    
    }   


}

