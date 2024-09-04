package edu.ithaca.dragon.shapes;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;

        if (length <= 0) 
            throw new IllegalArgumentException("Length must be greater than 0.");
        if (width <= 0) 
            throw new IllegalArgumentException("Width must be greater than 0.");

    }

     public String toString(){
        return("Rectangle:" + " - Lenght: " + this.getlength() + " - Width" + this.getwidth());

    }

    public float calcArea(float length, float width){
        float area = length * width;
        return area;
    }

    public void doubleSize(){
        this.length = length *2;
        this.width = width *2;
    }

    public float longestLineWithin(){
        return (float) Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
    public float getlength(){
        float getlength = length;
        return getlength;
    }
    public float getwidth(){
        float getwidth = width;
        return getwidth;
    }
}
