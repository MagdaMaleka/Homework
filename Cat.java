import java.util.Scanner;

public class Cat extends Animal implements Voice {

    String catType;
    int age;

    public void checkCatAge(){

        Scanner wiekKota = new Scanner(System.in);
        System.out.println("\nPodaj wiek kota: ");
        age = wiekKota.nextInt();

        if (age>10){
            System.out.println("Zabierz kota do wterynarza");
        } else {
            System.out.println("Twój kot jest jeszcze młody");
        }
    }

    public void showCatAttributes(){
        System.out.println("\nKot:");
        System.out.println("Rasa: " + catType);
        System.out.println("Głos: " + cat);
    }
}
