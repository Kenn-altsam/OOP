package Lab2.Problem1.PartA;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class Shape3DTest {
    static void main(String[] args) {
        Cylinder cylinder =  new Cylinder(5, 10);
        Sphere sphere = new Sphere(7);
        Cube cube = new Cube(4);

        System.out.println("Cylinder: radius = 5, height = 10");
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("Surface area: " + cylinder.surfaceArea());
        System.out.println();

        System.out.println("Sphere: radius = 7");
        System.out.println("Volume: " + sphere.volume());
        System.out.println("Surface area: " + sphere.surfaceArea());
        System.out.println();

        System.out.println("Cube: side = 4");
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface area: " + cube.surfaceArea());
        System.out.println();

        Shape3D[] shapes = {cylinder, sphere, cube};
        double totalVolume = 0;
        double totalSurfaceArea = 0;

        for (int i = 0; i < shapes.length; i++) {
            totalVolume += shapes[i].volume();
            totalSurfaceArea += shapes[i].surfaceArea();
        }

        System.out.println("Total volume: " + totalVolume);
        System.out.println("Total surface area: " + totalSurfaceArea);
    }
}
