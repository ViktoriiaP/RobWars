package robot;

import java.util.Scanner;

public class Menu {
    public static String getStringFromConsole(Robot workingRobot) {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextLine();
        } catch (Exception e) {
            return "OMG";
        }
    }
}
