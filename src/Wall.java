public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Wall() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;

    }


    public double getHeight() {
        if (height<0){

        }
        return 0;
    }

    public void setHeight(double height) {
        this.height = height;




    }

    public double getArea() {
        if (height>0&&width>0){
            return width*height;
        }


    return 0;

}
    }
