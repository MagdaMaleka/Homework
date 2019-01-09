import java.util.Scanner;

public class GeometricFigures implements Array {

    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        String wzorzec;
        Kolo koło = new Kolo(5);
        Kwadrat kwadrat = new Kwadrat(2);
        Prostokąt prostokąt = new Prostokąt(3,7);
        Trójkąt trójkąt = new Trójkąt(5,3);

        System.out.println("Oblicz pole: ");
        System.out.println("A. Kwadrat B. Prostokąt C. Koło D. Trójkąt");
        wzorzec = reader.next();

        for (int i = 0; i < geometricFigures.length; i++) {
            wzorzec = geometricFigures[i];
            switch (wzorzec) {
                case "Kwadrat":
                    System.out.println(kwadrat);
                    break;
                case "Prostokąt":
                    System.out.println(prostokąt);
                    break;
                case "Koło":
                    System.out.println(koło);
                    break;
                case "Trójkąt":
                    System.out.println(trójkąt);
                    break;
                default: {
                    System.out.println("Wybrano nieznaną figurę");
                }
            }
        }
    }

    public static class Kolo {
        private double promien;

        public Kolo() {
            this(1.0);
        }

        public Kolo(double r) {
            promien = r;
        }

        public double obliczPole() {
            return Math.PI * promien * promien;
        }

        public String toString() {
            return "Pole: " + obliczPole();
        }
    }

    public static class Kwadrat {
        private double bokA;

        public Kwadrat() {
            this(1);
        }

        public Kwadrat(double a) {
            bokA = a;
        }

        public double obliczPole() {
            return bokA * bokA;
        }

        public String toString() {
            return "Pole: " + obliczPole();
        }
    }

    public static class Trójkąt {
        private double bokA;
        private double H;

        public Trójkąt() {
            this(1, 1);
        }

        public Trójkąt(double a, double h) {
            bokA = a;
            H = h;
        }

        public double obliczPole() {
            return 0.5 * bokA * H;
        }

        public String toString() {
            return "Pole: " + obliczPole();
        }
    }

    public static class Prostokąt {
        private double bokA;
        private double bokB;

        public Prostokąt() {
            this(1, 1);
        }

        public Prostokąt(double a, double b) {
            bokA = a;
            bokB = b;
        }

        public double obliczPole() {
            return bokA * bokB;
        }

        public String toString() {
            return "Pole: " + obliczPole();
        }
    }
}