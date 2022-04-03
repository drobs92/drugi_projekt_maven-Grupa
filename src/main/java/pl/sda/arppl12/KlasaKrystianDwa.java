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
        float liczba = scanner.nextFloat();

        System.out.println("Podaj 2 liczbę zmiennoprzecinkową");
        float liczbaDwa= scanner.nextFloat();

        float suma = liczba + liczbaDwa;
        float roznica = liczba - liczbaDwa;

        System.out.println("Hej " + imie + imieDwa + " suma tych dwóch liczb to: "
                + suma + " a różnica: " + roznica);




    }
}
