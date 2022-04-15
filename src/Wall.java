public class Wall {
    private double width;
    private double heigth;


    public Wall() {
    }

    public double getWidth() {


        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {

        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public Wall(double width, double heigth) {

        this.width = width;
        this.heigth = heigth;

    }

    public double area() {
        if(width<0){
        return width*heigth;

    }
      return 0;
}
    }