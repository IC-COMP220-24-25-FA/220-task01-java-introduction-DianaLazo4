package edu.ithaca.dragon.shapes;

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

    public String toString(){
        return("Triangle:" + " - Base: " + this.getbase() + " - Width" + this.getheight());

    }
    public float calcArea(float base, float height){
        float area = base * height * 0.5f;
        return area;
    }
    
    public void doubleSize(){
        this.base = base *2;
        this.height = height *2;
    }

    public float longestLineWithin(){
        return (float) Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    public float getbase(){
        float getbase = base;
        return getbase;
    }
    public float getheight(){
        float getheight = height;
        return getheight;
    }
}
