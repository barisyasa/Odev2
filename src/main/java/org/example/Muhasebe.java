package org.example;

import java.util.Scanner;

public class Muhasebe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double gunlukUcret = 1500.00;
        double prim = 1000.00;


        System.out.print("Çalışılan gün sayısını girin: ");
        int calisilanGun = scanner.nextInt();

       if (calisilanGun >= 25) {
           double toplamMaas = calisilanGun * (gunlukUcret+prim);
           System.out.println("Toplam maaş: " + toplamMaas + " TL");
       }else {
           double toplamMaas = calisilanGun * gunlukUcret;
           System.out.println("Toplam maaş: " + toplamMaas + " TL");
       }


        scanner.close();
    }
}





