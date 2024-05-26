package org.example;

import java.util.Scanner;

public class Muhasebe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Çalışılan gün sayısını girin: ");

        Person staff = new Person(1500,1000,scanner.nextInt());

        System.out.println("Toplam maaş: " + staff.calculate() + " TL");

        scanner.close();
    }
}