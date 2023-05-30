package Odev3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıları girin: ");
        String input = scanner.nextLine();

        String[] sayilar = input.split(" ");
        int koloniSayisi = sayilar.length;

        Koloni[] koloniler = new Koloni[sayilar.length];

        for (int i = 0; i < sayilar.length; i++) {
            int sayi = Integer.parseInt(sayilar[i].trim());
            koloniler[i] = new Koloni(sayi);
           
     
       }
        Oyun oyun = new Oyun(koloniler);
        oyun.oyunuBaslat();
    }
}
