import java.lang.Math;

class Cylinder{
    
    int radius;
    int height;

    public void Cone(radius,height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius(){
        return this.radius;
    }
    public int getHeight(){
        return this.height;
    }

    public void setHeight(height){
        this.height = height;
    }
    public void setRadius(radius){
        this.radius = radius;
    }

    public double getVolume(){
        return (Math.PI * this.radius * this.radius * this.height);
    }
    public double getSurfaceArea(){
        return (2 * Math.PI * this.radius * this.radius + 2 * Math.PI * this.radius * this.height);
    }
}