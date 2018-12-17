class Box {
    double height;
    double width;
    double length;

    public void Box(double height, double width, double length){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getVolume(){
        return this.length * this.width * this.height;
    }
    
    public double getSurfaceArea(){
    
        double faceArea = this.length * this.height;
        double topArea = this.length * this.width;
        double sideArea = this.width * this.height;

        return (2 * faceArea) + (2 * sideArea) + (2 * topArea);
    }
}