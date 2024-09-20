package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "";

        System.out.println("Willkommen bei RoboWars. Wie lautet dein Name? [Name Eingeben]: ");
        username = sc.nextLine();

        System.out.println("Ah, du bist es " + username + ", schön das du da bist!");
    }
}