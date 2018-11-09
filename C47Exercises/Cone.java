import java.lang.Math;

class Cone{
    
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

    public double slantHeight(){
        return Math.sqrt(this.radius * this.radius + this.height * this.height);
    } 
    public double angle(){
        return Math.atan(this.radius / this.height);
    }

}