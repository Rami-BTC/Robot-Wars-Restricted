package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "";
        String roboName = "";
        int roboNumber = 0;
        boolean robotShown = false;
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
        //-----------------------------------


        int length = 15;
        int height = 10;

        int currentPosLength = 1;
        int currentPosHeight = 0;

        boolean gameOn = true;
        int movementDir = 0;

        while (gameOn) {
            System.out.println("""
                \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
                ~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~//~~~~~~~~~~~~
                """);

            System.out.println("Dein Name: " + username + "\nDein Robotername: " + roboName);
            int tmp = roboNumber;
            while (!robotShown) {
                while (tmp == 1) {
                    System.out.println("""
                             _._      _,-'" "`-._
                            (,-.` ._,'(        |\\`-/|
                                ` -.-' \\ )- ` ( , o o)
                                       `-     \\`_`"'-
                            """);
                    tmp = 0;
                }

                while (tmp == 2) {
                    System.out.println("""
                            ("`-''-/").___..--''"`-._\s
                             `6_ 6  )   `-.  (     ).`-.__.`)\s
                             (_Y_.)'  ._   )  `._ `. ``-..-'\s
                               _..`--'_..-_/  /--'_.'
                              ((((.-''  ((((.'  (((.-'\s
                            """);
                    tmp = 0;
                }
                robotShown = true;
                System.out.println();
            }
            robotShown = false;

            while (currentPosLength == 15){
                currentPosLength--;
            }

            while (currentPosLength == 0){
                currentPosLength++;
            }

            while (currentPosHeight == 10){
                currentPosHeight--;
            }

            while (currentPosHeight == -1){
                currentPosHeight++;
            }

            System.out.println("Spielfeld: ");
            int currentHeight = 0;
            while (currentHeight < height) {
                int currentLength = 1;
                while (currentLength < length) {

                    int tmp2 = currentLength;
                    int tmp4 = -1;
                    while (tmp2 == currentPosLength){
                        int tmp3 = currentHeight;
                        while (tmp3 == currentPosHeight){
                            System.out.print("["+roboName.charAt(0)+"]");
                            tmp4 = tmp2;
                            tmp2--;
                            tmp3--;
                        }
                        tmp2 = -1;
                    }
                    while (currentLength != tmp4){
                        System.out.print("[ ]");
                        tmp4 = currentLength;
                    }
                    currentLength++;
                }
                System.out.println();
                currentHeight++;
            }

            System.out.println("""
                   
                    Nach Links: [1]
                    Nach Rechts: [2]
                    Nach Oben: [3]
                    Nach Unten: [4]
                   
                   """);

            movementDir = sc.nextInt();

            while (movementDir > 0){
                while (movementDir == 1){
                    currentPosLength--;
                    movementDir = 0;
                }
                while (movementDir == 2){
                    currentPosLength++;
                    movementDir = 0;
                }
                while (movementDir == 3){
                    currentPosHeight--;
                    movementDir = 0;
                }
                while (movementDir == 4){
                    currentPosHeight++;
                    movementDir = 0;
                }
                while (movementDir > 4){
                    movementDir = 0;
                }
            }
        }
    }
}