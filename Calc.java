import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;
        double action;
        char sign;
        Scanner scan = new Scanner(System.in);

        System.out.println("First number: ");
        firstNumber = scan.nextDouble();

        System.out.println("Second number: ");
        secondNumber = scan.nextDouble();

        System.out.println("Press +");
        System.out.println("Press -");
        System.out.println("Press *");
        System.out.println("Press /");

        switch (sign = scan.next().charAt(0)) {
            case '+':
                action = firstNumber + secondNumber;
                System.out.printf("%.2f%n", action);
                break;
            case '-':
                action = firstNumber - secondNumber;
                System.out.printf("%.2f%n", action);
                break;
            case '*':
                action = firstNumber * secondNumber;
                System.out.printf("%.2f%n", action);
                break;
            case '/':
                action = firstNumber / secondNumber;
                System.out.printf("%.2f%n", action);
                break;
        }
    }
}

