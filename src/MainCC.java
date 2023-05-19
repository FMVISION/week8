public class MainCC {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        System.out.println(" cirlce.radius =" + circle.getRadius());
        System.out.println("circle.area =" + circle.getArea);


        Cylinder c = new Cylinder(5.55,7.25);

        System.out.println("cylinder.radius = " + c.getRadius());
        System.out.println("cylinder.height " + c.getHeight());
        System.out.println("cylinder.area = " + c.getVolume());
        System.out.println("cylinder.volume = + c.getArea");

    }
}
