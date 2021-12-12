package robot;

import java.util.Scanner;

public class Menu {
    public static String getLetterFromConsole(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextLine();
        } catch (Exception e) {
            return "OMG";
        }

    }
}
