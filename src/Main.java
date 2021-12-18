import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scan.next();
        System.out.println("Podaj nazwisko");
        String nazwisko = scan.next();
        System.out.println("Podaj wiek");
        int wiek = scan.nextInt();
        System.out.println("Podaj nr indeksu");
        int nrindeksu = scan.nextInt();

        /*   b) wyświetlić dane za pomocą println i printf
        */
        System.out.println("Twoje imie i nazwisko to " + imie + " " + nazwisko + ", twój wiek to " + wiek + ", a numer indeksu to " + nrindeksu + ".");


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        int a = 10, b = 2;
        int dodawanie = a+b;
        int odejmowanie = a-b;
        int mnożenie = a*b;
        int dzielenie = a/b;
        int moduloliczb = a%b;
        System.out.println("Dodawanie "+dodawanie+" odejmowanie "+odejmowanie+" mnożenie "+mnożenie+" dzielenie "+dzielenie+" modulo liczb "+moduloliczb);

    }
}
