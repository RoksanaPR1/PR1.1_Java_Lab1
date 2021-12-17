import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        int zmienna_1;
        zmienna_1 = 5;
        System.out.println(zmienna_1);
        char zmienna_2;
        zmienna_2 = 'c';
        System.out.print(zmienna_2+"\n");
        boolean zmienna_3 = true;
        System.out.print(zmienna_3);
        double zmienna_4 = 3.14;
        System.out.print(zmienna_4);

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        */
        int a = 4, b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        /*
        *
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        double c = 4.8, d = 2.6;
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.print(c%d);


    }
}
