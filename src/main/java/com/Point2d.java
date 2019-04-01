package com;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;
    Point2d(float x,float y){
        this.x = x;
        this.y = y;
    }
    Point2d(){}

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{getX(), getY()};
    }
    public String toString() {
        return " x = "+ getX() +" y = "+ getY();
    }
}
