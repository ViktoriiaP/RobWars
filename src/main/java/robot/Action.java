package robot;

public class Action {
    public static void main(String[] args) {
        Robot workingRobot;
        Robot robot = new Robot();
        Robot robot1 = new Robot();
        ListOfRobots.addRobot(robot);
        ListOfRobots.addRobot(robot1);
        String robotsName;
        int countsOfRobot = 2;
        for (int i = 0; i <
                countsOfRobot; i++) {

            do {
                MenuRobots.printMenuRobots();
                robotsName = MenuRobots.getLetterFromConsole();
                if (robotsName.equals("")) {
                    System.out.println("Name for robot not entered! Enter robot's name: ");
                    continue;
                } else {
                    System.out.println("Your robot's name is " + robotsName);
                    workingRobot = MenuRobots.setRobotName (robotsName);

                    boolean exitFromMenuAction;
                    do {
                        MenuAction.printMenuAction(workingRobot);
                        String menuAction = MenuAction.getLetterFromConsole();
                        exitFromMenuAction = menuAction.equalsIgnoreCase("L");
                        if (exitFromMenuAction) {
                            //  System.out.println(menuAction);
                            MenuAction.actionInMenuAction(workingRobot, menuAction);
                        }
                    } while (exitFromMenuAction);
                }
            } while (
                    countsOfRobot != 2);

        }
    }
}


