import java.util.Scanner;

public class zad {
        public static void main(String[] args) {
            int rozmiarTablicy ;

            System.out.println("Podaj rozmiar tablicy: ");
            Scanner odczyt = new Scanner(System.in);
            rozmiarTablicy = odczyt.nextInt();

            int[] array = new int[rozmiarTablicy];

            for (int i=0; i<array.length; i++){
                array[i] = i + 1;
            }

            for (int i=0; i<array.length; i++){
                System.out.println(array[i]);
            }

            for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
                int aux = array[start];
                array[start]=array[end];
                array[end]=aux;
            }

            for (int i=0; i<array.length; i++){
                System.out.println(array[i]);
            }

        }
    }

