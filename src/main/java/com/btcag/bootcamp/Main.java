package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static String username;
    public static int robotNumber = 0;
    public static String robotName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] playArea = new int [10][15];
        int currPosY = 0;
        int currPosX = 0;

        welcomeScreen(sc);
        robotSelection(sc);
        showStats();
        generateField(playArea, currPosY, currPosX);
    }

    private static void generateField(int[][] playArea, int currPosY, int currPosX) {
        for (int i = 0; i < playArea.length; i++){
            for (int j = 0; j < playArea[i].length; j++){
                System.out.print("[");
                if ((i + 1) == currPosY && (j + 1)== currPosX){
                    System.out.print(username.charAt(0));
                } else {
                    System.out.print(" ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }

    private static void showStats(){
        consoleClear();
        System.out.println("Dein Name: " + username + "\nDein Robotername: " + robotName);
        if (robotNumber == 0){
            System.out.println("""
                             _._      _,-'" "`-._
                            (,-.` ._,'(        |\\`-/|
                                ` -.-' \\ )- ` ( , o o)
                                       `-     \\`_`"'-
                            """);
        } else{
            System.out.println("""
                            ("`-''-/").___..--''"`-._\s
                             `6_ 6  )   `-.  (     ).`-.__.`)\s
                             (_Y_.)'  ._   )  `._ `. ``-..-'\s
                               _..`--'_..-_/  /--'_.'
                              ((((.-''  ((((.'  (((.-'\s
                            """);
        }
    }

    private static void consoleClear() {
        System.out.println("""
            \n
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            ~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~//~~~~~~~~~~~~
            """);
    }

    private static void robotSelection(Scanner sc) {

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


        int input;
        do {
            input = sc.nextInt();

            if (input == 1){
                robotNumber = 0;
            } else if (input == 2){
                robotNumber = 1;
            }
        } while (input < 1 || input > 2);


        System.out.println("""
                ~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~//~~~~~~~~~~~~
                """);

        System.out.println("""
                      Sehr schön, jetzt brauchen wir nur noch einen Namen...:
                """);

        Scanner sc2 = new Scanner(System.in);
        robotName = sc2.nextLine();

    }

    private static void welcomeScreen(Scanner sc) {
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
                            ⠀⠀⠀⠀⣿⣿⣿⡇⠀⠀⠀⢼⣿⠀⢿⣿⣿⣿⣿⠀⣾⣷⠀⠀ ⢿⣿⣷⠀⠀⠀⠀⠀
                            ⠀⠀⠀⢠⣿⣿⣿⣷⡀⠀⠀⠈⠋⢀⣿⣿⣿⣿⣿⡀⠙⠋⠀⢀⣾⣿⣿⡀
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
        sc.nextLine();
        //-----------------------------------
    }

    //I might need those in the future
    private static void generateCoordsX(){
        char[] coords = {'/', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O'};

        for (char c : coords){
            System.out.print("["+c+"]");

            if (c == 'O'){
                System.out.println();
            }
        }
    }

    private static void generateCoordsY(int currCord){
        System.out.print("["+currCord+"]");
        }
}