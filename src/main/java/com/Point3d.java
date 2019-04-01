package com;

public class Point3d extends Point2d {
    private float z = 0.0f;
    public Point3d(float x,float y,float z){
        super(x, y);
        this.z = z;
    }
    public  Point3d(){}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void  setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY()};
    }
    public String toString(){
        return " x = "+ super.getX() +" y = "+ super.getY() +" z = "+ getZ();
    }
}
