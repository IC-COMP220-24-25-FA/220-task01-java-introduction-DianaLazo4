package edu.ithaca.dragon.shapes;
// GOING TO DO FOR RIGHT ANGLE TRIANGLES
public class Triangle {
    private float base;
    private float height;

    public Triangle(float base, float height){
        this.base = base;
        this.height = height;

        if (base <= 0) 
            throw new IllegalArgumentException("Length must be greater than 0.");
        if (height <= 0) 
            throw new IllegalArgumentException("Width must be greater than 0.");

    }

    public float calcArea(float base, float height) {
        float cut = (float) 2.0 ;
        return ((base * height)/cut);
    }

    public void doubleSize(){
        this.base = base *2;
        this.height = height *2;
    }

    public float longestLineWithin() {
        return (float) Math.sqrt(Math.pow(base,2) + Math.pow(height, 2));
    }
    public float getbase(){
        float getbase = base;
        return getbase;
    }
    public float getheight(){
        float getbase = base;
        return getbase;

    }
}