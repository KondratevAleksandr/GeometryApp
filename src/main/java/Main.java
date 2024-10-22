
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(rectangle);

        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(3, 4, 6);

        System.out.println("Is the area of the triangles is equal: " +
                GeometryUtils.compareTriangles(triangle1, triangle2));

        Circle c2 = new Circle(5);
        System.out.println("Is the area of the circles is equal: " +
                GeometryUtils.compareCircles(c1, c2));

        Cube cube = new Cube(5);
        System.out.println("Volume of a cube: " + cube.getVolume());
        System.out.println("Cube surface area: " + cube.getSurfaceArea());

        Sphere sphere = new Sphere(2);
        System.out.println("Sphere volume: " + sphere.getVolume());
        System.out.println("Surface area of a sphere: " + sphere.getSurfaceArea());

        Cylinder cylinder = new Cylinder(2, 3);
        System.out.println("Volume of a cylinder: " + cylinder.getVolume());
        System.out.println("Surface area of a cylinder: " + cylinder.getSurfaceArea());
    }
}
