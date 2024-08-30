package edu.ithaca.dragon.shapes;

public class Circle {
    public double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(double radius){
        float pie= (float) 3.14;
        double area = radius*radius*pie;
        return area;

        //throw new RuntimeException("Not implemented yet");
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        double nradius = radius *2;
        radius = nradius;
        //throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double diameter = radius *2;
        return diameter;
        //throw new RuntimeException("Not implemented yet");
    }
}
