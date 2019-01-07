import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        String jakisTekst;
        Scanner tekst = new Scanner(System.in);

        System.out.println("Hello World!!!");
        System.out.println("Wpisz jakiś tekst: ");

        jakisTekst = tekst.nextLine();

        System.out.println("Wpisałeś: " + jakisTekst);

    }
}
