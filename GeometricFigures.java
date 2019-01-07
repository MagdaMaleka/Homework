import java.util.Scanner;

public class GeometricFigures implements Array {

    public static double surfaceArea;
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        for (String figure : geometricFigures) {

        }

    }
public static class Koło {
        private double promien;

        public Koło(){
            this(1.0);
        }
        public Koło (double r) {
            promien = r;
        }

        public double obliczPole(){
            return Math.PI*promien*promien;
        }

        public String toString(){
            return "Pole: " + obliczPole();
        }
}
   /* public class surfaceArea {

    }
*/
   /* void square() {
        int a, b;

        System.out.println("--->Square<---");
        System.out.println("a: ");
        a = reader.nextInt();
        System.out.println("b: ");
        b = reader.nextInt();

        surfaceArea = a * b;
        System.out.println("Square area = " + surfaceArea);
    }

    void triangle(){
        int a, h;

        System.out.println("--->Triangle<---");
        System.out.println("a: ");
        a = reader.nextInt();
        System.out.println("h: ");
        h = reader.nextInt();

        surfaceArea = 0.5 * a *h;
        System.out.println("Triangle area = " + surfaceArea);
    }

    void circle(){
        double pi = 3.14;
        int r;

        System.out.println("--->Circle<---");
        System.out.println("r: ");
        r = reader.nextInt();

        surfaceArea = pi * (r^2);
        System.out.println("Circle area: " + surfaceArea);
    }

    void rectangle(){
        int a,b;

        System.out.println("--->Rectangle<---");
        System.out.println("a: ");
        a = reader.nextInt();
        System.out.println("b: ");
        b = reader.nextInt();

        surfaceArea = a*b;
        System.out.println("Rectangle area: " + surfaceArea);
    }
*/}