package robot;

public class MenuAction extends Menu {
    public static void printMenuAction(Robot workingRobot) {
        Robot robot = new Robot();

        System.out.println();
        System.out.println("Choose action : ");
        System.out.println("QWEASDZXC : Choose one of this letter for shooting to robot ");
        System.out.println("L : Exit from menu ");
        System.out.println("Your choice : ");
    }
    public static void actionInMenuAction(Robot robotName, String shootingLetter) {
        shootingLetter = getLetterFromConsole();

        if (shootingLetter.equalsIgnoreCase("Q")) {
            robotName.shootingToRobot(shootingLetter, robotName.getRobotName());
            System.out.println("Shooting to " + robotName);
        }
        else if (shootingLetter.equalsIgnoreCase("l")) {
            System.out.println("LLLLLLLLL");
        } else{
            System.out.println("Ooops, something wrong");

        }
//        switch (menuAction) {
//            case "Q" :
//                System.out.println("Enter the letter from list QWEASDZXC for shooting");
//                String shootingLetter = getLetterFromConsole();
//                robotName.shootingToRobot(shootingLetter, robotName.getRobotName());
//                break;
//            case "L" :
//                System.out.println("L");
//                break;
//            default:
//                System.out.println("Ooops, something wrong");

    }

}

