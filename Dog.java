import java.util.Scanner;

public class Dog extends Animal implements Voice {

        String dogType;
        int speed;

    public void checkDogSpeed(){
        Scanner predkosc = new Scanner(System.in);
        System.out.println("Podaj predkosc psa: ");
        speed = predkosc.nextInt();

        if (speed >= 50){
            System.out.println("Champion");
        }else {
            System.out.println("Konieczny trening");
        }
    }

    public void showDogAttributes(){
        System.out.println("Pies:");
        System.out.println("Rasa: " + dogType);
        System.out.println("Głos: " + dog);
    }
}
