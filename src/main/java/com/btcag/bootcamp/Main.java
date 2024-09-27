package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = loginScreen(sc);
        int robotNumber = selectRobotNumber(sc);
        String robotName = selectRobotName(sc);

        int[][] playArea = new int [10][15];    // Y = 10, X = 15
        int[] userPos = {1, 1};                 // X = 1, Y = 1

        while (true) {
            showStats(username, robotName, robotNumber);
            generateField(playArea, userPos, robotName);
            moveRobot(sc, userPos);
        }
    }

    /**
     * Appears on Start Up
     *
     * @return The chosen username.
     */
    private static String loginScreen(Scanner sc) {

        System.out.print(getWelcomeAscii());
        String name = sc.nextLine();

        separator();

        System.out.println(
                "           Ah, du bist es " + name + ", schön, dass du da bist!\n");
        System.out.println("""
                                   Drücke Enter um fortzufahren...
                """);

        sc.nextLine();
        return name;
    }

    /**
     * Shows 2 available Robots
     *
     * @param sc Scanner Class
     * @return The chosen robotNumber
     */
    private static int selectRobotNumber(Scanner sc) {

        separator();
        System.out.println("Wähle einen Katzenroboter aus!\n");
        System.out.println(getSelectorAscii());

        //User can select either [ 1 ] or [ 2 ]
        int input;
        do {
            input = sc.nextInt();
            if (input > 0 && input < 3) {
                return input - 1;
            }
        } while (input < 0 || input > 2);

        //Default Return
        return 0;
    }

    /**
     * Lets user choose a robotName
     *
     * @param sc Scanner Class
     * @return The chosen robotName
     */
    private static String selectRobotName(Scanner sc) {
        separator();
        System.out.println("""
                      Sehr schön, jetzt brauchen wir nur noch einen Namen...:
                """);
        sc.nextLine();
        return sc.nextLine();
    }

    /**
     * Displays users attributes
     *
     * @param username The users name
     * @param robotName The users robotName
     * @param robotNumber The users robotNumber
     */
    private static void showStats(String username, String robotName, int robotNumber){
        consoleClear();
        System.out.println("Dein Name: " + username + "\nDein Robotername: " + robotName);
        showRobotAscii(robotNumber);
    }
    private static void showRobotAscii(int robotNumber) {
        if (robotNumber == 0){
            System.out.println(getRobot1Ascii());
        } else{
            System.out.println(getRobot2Ascii());
        }
    }

    /**
     * Generates the playArea / field
     *
     * @param playArea height & width of the play area
     * @param userPos Position of the user
     * @param robotName The robots name
     */
    private static void generateField(int[][] playArea, int[] userPos, String robotName) {
        for (int y = 0; y < playArea.length; y++){
            for (int x = 0; x < playArea[y].length; x++){
                System.out.print("[");

                checkPlayerPositions(userPos, robotName, x, y);

                System.out.print("]");
            }
            System.out.println();
        }
    }
    private static void checkPlayerPositions(int[] userPos, String robotName, int xAxis, int yAxis) {
        if ((xAxis + 1) == userPos[0] && (yAxis + 1) == userPos[1]){
            System.out.print(robotName.charAt(0));
        } else {
            System.out.print(" ");
        }
    }

    /**
     * Moves the player to a new position
     *
     * @param sc Scanner class
     * @param userPos Position of the user
     */
    private static void moveRobot(Scanner sc, int[] userPos){
        System.out.println("Bewege deinen Roboter: [1]Rechts]- || [2]Links]- || [3]Oben]- || [4]Unten-  //  [5]Skip]");
        processInput(sc, userPos);
    }
    private static void processInput(Scanner sc, int[] userPos) {
        int input;
        do {
            input = sc.nextInt();
            switch (input){
                case 1:
                    if (checkIfMoveIsValid(userPos, 0, 16)) {userPos[0]++;} else{input = 0;}
                    break;
                case 2:
                    if (checkIfMoveIsValid(userPos, 0, 0)) {userPos[0]--;} else{input = 0;}
                    break;
                case 3:
                    if (checkIfMoveIsValid(userPos, 1, 0)) {userPos[1]--;} else{input = 0;}
                    break;
                case 4:
                    if (checkIfMoveIsValid(userPos, 1, 11)) {userPos[1]++;} else{input = 0;}
                    break;
                case 5:
                    break;
            }
        } while (input < 1 || input > 5);
    }
    private static boolean checkIfMoveIsValid(int[] userPos, int xy, int border) {
        if (userPos[xy] + 1 != border && userPos[xy] - 1 != border){
            return true;
        } else{
            System.out.println("Dieser Zug ist nicht möglich!");
            return false;
        }
    }

    //----Misc...----
    /**
     * "Clears" the console
     */
    private static void consoleClear() {
        System.out.println("""
            \n
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            ~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~//~~~~~~~~~~~~
            """);
    }

    /**
     * Separates console
     */
    private static void separator(){
        System.out.println("""                                                            
                ~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~//~~~~~~~~~~~~
                """);
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

    //-----------------------------------------ASCII----------------------------------------------------//

    private static String getWelcomeAscii(){
        return """
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
                Willkommen bei RoboWars. Wie lautet dein Name? [Name Eingeben]: \s""";
    }
    private static String getRobot1Ascii(){
        return """
                             _._      _,-'" "`-._
                            (,-.` ._,'(        |\\`-/|
                                ` -.-' \\ )- ` ( , o o)
                                       `-     \\`_`"'-
                            """;
    }
    private static String getRobot2Ascii(){
        return """
                            ("`-''-/").___..--''"`-._\s
                             `6_ 6  )   `-.  (     ).`-.__.`)\s
                             (_Y_.)'  ._   )  `._ `. ``-..-'\s
                               _..`--'_..-_/  /--'_.'
                              ((((.-''  ((((.'  (((.-'\s
                            """;
    }
    private static String getSelectorAscii(){
        return """
                     _._      _,-'"" `- ._              ("`-''-/").___..--''"`-._\s
                    (,-. `._ ,'(         |\\`-/|         `6_ 6  )   `-.  (     ).`-.__.`)\s
                         `-. -' \\ )-`  (  o o)          (_Y_.)'  ._   )  `._ `. ``-..-'\s
                               `-    \\`_ `"'-             _..`--'_..-_/  /--'_.'
                                  --     --                ((((.-''  ((((.'  (((.-'\s
                                   [ 1 ]                            [ 2 ]
                """;
    }
}