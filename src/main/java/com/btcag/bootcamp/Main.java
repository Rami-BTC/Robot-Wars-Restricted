package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "";
        String roboName = "";
        int roboNumber = 0;
        String input;

        System.out.println("""
                       \s
                            ⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣠⣤⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀
                            ⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀
                            ⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠘⣿⣿⣿⣿⠟⠁⠀⠀⠀⠹⣿⣿⣿⣿⣿⠟⠁⠀⠀⠹⣿⣿⡿⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⣿⣿⣿⡇⠀⠀⠀⢼⣿⠀⢿⣿⣿⣿⣿⠀⣾⣷⠀⠀⢿⣿⣷⠀⠀⠀⠀⠀
                            ⠀⠀⠀⢠⣿⣿⣿⣷⡀⠀⠀⠈⠋⢀⣿⣿⣿⣿⣿⡀⠙⠋⠀⢀⣾⣿⣿⠀⠀⠀⠀⠀
                            ⢀⣀⣀⣀⣿⣿⣿⣿⣿⣶⣶⣶⣶⣿⣿⣿⣿⣾⣿⣷⣦⣤⣴⣿⣿⣿⣿⣤⠤⢤⣤⡄
                            ⠈⠉⠉⢉⣙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣀⣀⣀⡀⠀
               \s
                Willkommen bei RoboWars. Wie lautet dein Name? [Name Eingeben]:\s""");
        username = sc.nextLine();

        System.out.println("""
                ~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~//~~~~~~~~~~~~
                """);
        System.out.println(
                "       Ah, du bist es " + username + ", schön, dass du da bist!\n");

        System.out.println("""
                                Drücke Enter um fortzufahren...
                """);

        //-----------------------------------
        input = sc.nextLine();
        //-----------------------------------

        System.out.println("""
                ~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~//~~~~~~~~~~~~
                """);

        System.out.println("Wähle einen Katzenroboter aus!\n");
        System.out.println("""
                     _._      _,-'"" `- ._              ("`-''-/").___..--''"`-._\s
                    (,-. `._ ,'(         |\\`-/|         `6_ 6  )   `-.  (     ).`-.__.`)\s
                         `-. -' \\ )-`  (  o o)          (_Y_.)'  ._   )  `._ `. ``-..-'\s
                               `-    \\`_ `"'-             _..`--'_..-_/  /--'_.'
                                  --     --                ((((.-''  ((((.'  (((.-'\s
                                   [ 1 ]                            [ 2 ]
                """);

        //-----------------------------------

        while (roboNumber < 1){
            roboNumber = sc.nextInt();
            while (roboNumber > 2){
                roboNumber = 0;
            }
        }

        //-----------------------------------
        System.out.println("""
                ~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~//~~~~~~~~~~~~
                """);

        System.out.println("""
                      Sehr schön, jetzt brauchen wir nur noch einen Namen...:
                """);
        //-----------------------------------
        Scanner sc2 = new Scanner(System.in);
        roboName = sc2.nextLine();

        System.out.println(roboNumber);

    }
}