package edu.ithaca.dragon.shapes;

public class Circle {
    public float radius;{
        if (radius <= 0) 
           throw new IllegalArgumentException("Radius must be greater than 0.");
    }
    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(float radius){
        this.radius = radius;
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
        float nradius = radius *2;
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
