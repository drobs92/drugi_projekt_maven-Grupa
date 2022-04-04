package pl.sda.arppl12;

import java.util.Scanner;

public class KlasaKrystianDwa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 imię");
        String imie = scanner.next();

        System.out.println("Podaj 2 imię");
        String imieDwa = scanner.next();

        System.out.println("Podaj 1 liczbę zmiennoprzecinkową");
        double liczba = scanner.nextDouble();

        System.out.println("Podaj 2 liczbę zmiennoprzecinkową");
        double liczbaDwa= scanner.nextDouble();

        double suma = liczba + liczbaDwa;
        double roznica = liczba - liczbaDwa;

        System.out.println("Hej " + imie + imieDwa + " suma tych dwóch liczb to: "
                + suma + " a różnica: " + roznica);




    }
}
