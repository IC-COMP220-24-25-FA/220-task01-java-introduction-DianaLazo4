package edu.ithaca.dragon.shapes;

public class Circle {
    private float radius;
        
    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(float radius){
        this.radius = radius;
        if (radius <= 0) 
            throw new IllegalArgumentException("Radius must be greater than 0.");
    
    }

    public String toString(){
        return("Circle:" + " - Radius: " + this.getradius());

    }


    /**
     * @return the area of this circle
     */
    public float calcArea(float radius){
        float pie= (float) 3.1415;
        float area = radius*radius*pie;
        return area;

        //throw new RuntimeException("Not implemented yet");
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius = radius *2;
        //throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public float longestLineWithin(){
        float diameter = radius *2;
        return diameter;
        //throw new RuntimeException("Not implemented yet");
    }
    public float getradius(){
        float getradius = radius;
        return getradius;
    }
}
