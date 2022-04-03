package pl.sda.arppl12;

import java.util.Scanner;

public class KlasaKrystian {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cześć, jak masz na imię wędrowcze?");
        String imie = scanner.next();

        System.out.println("dobra, a jak masz na nazwisko?");
        String nazwisko = scanner.next();

        System.out.println("a jaki masz rozmiar obuwia pielgrzymie?");
        int rozmiar = scanner.nextInt();

        System.out.println("Ooo, " + imie + nazwisko + "- ale masz rozmiar buta! to aż " + rozmiar);

    }
}
