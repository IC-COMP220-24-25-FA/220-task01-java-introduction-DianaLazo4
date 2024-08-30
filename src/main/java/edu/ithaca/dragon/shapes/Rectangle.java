package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

        if (length <= 0) 
            throw new IllegalArgumentException("Length must be greater than 0.");
        if (width <= 0) 
            throw new IllegalArgumentException("Width must be greater than 0.");

    }

    public double calcArea(){
       throw new RuntimeException("Not implemented yet");
    }

    public void doubleSize(){
        throw new RuntimeException("Not implemented yet");
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
    
}
