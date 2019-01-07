import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double celcjusz, stopnie, farheint;

        System.out.println("Podaj temperaturę: ");

        Scanner odczyt = new Scanner(System.in);
        stopnie = odczyt.nextDouble();

        celcjusz = 0.56 * (stopnie - 32);
        farheint = 1.8 * stopnie + 32;

        System.out.println(stopnie + " stopni to: " + celcjusz + " stopni Celcjusza");
        System.out.println(stopnie + " stopni to: " + farheint + " stopni Farheinta");

    }
}
