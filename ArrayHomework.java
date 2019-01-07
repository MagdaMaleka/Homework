import java.util.Scanner;

public class ArrayHomework {
    private static int arrayLength;

    public static void main(String[] args) {
        pobieranieWielkosciTablicy();
        operacjeNaTablicy();
    }

    static void pobieranieWielkosciTablicy() {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        arrayLength = odczyt.nextInt();

        }

     static int[] operacjeNaTablicy() {
         int[] array = new int[arrayLength];

         System.out.println("Przed zamianą: ");

         for (int i = 0; i < array.length; i++) {
             array[i] = i + 1;
             System.out.println(array[i]);
         }

         System.out.println("Po zamianie: ");

         for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
             int aux = array[start];
             array[start] = array[end];
             array[end] = aux;
         }

         for (int i = 0; i < array.length; i++) {
             System.out.println(array[i]);
         }
         return (array);
     }

    }

