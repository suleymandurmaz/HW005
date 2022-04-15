public class MainApp {
    public static void main(String[] args) {
        Wall wall1=new Wall(5,4);
        wall1.setHeigth(-1.5);

        System.out.println("Area= "+wall1.area());
        System.out.println("Width="+wall1.getWidth());
        System.out.println("Heigth= "+wall1.getHeigth());
        System.out.println("Area= "+wall1.area());


            }
}
