package robot;

import java.util.ArrayList;

public class Action {
    public static void main(String[] args) {
        Robot workingRobot = null;
        MenuRobots.printMenuRobots();
        Robot robot = new Robot(MenuRobots.getStringFromConsole(workingRobot));
        MenuRobots.printMenuRobots();
        Robot robot1 = new Robot(MenuRobots.getStringFromConsole(workingRobot));
        ArrayList<Robot> robotArrayList = new ArrayList<>();
        robotArrayList.add(robot);
        robotArrayList.add(robot1);
        String menuAction;

        String keys = "QWEASDZXCL";
        boolean exitFromMenuAction = false;
        int isAlive = 1;

        while (exitFromMenuAction != true && isAlive == 1) {

            for (int i = 0; i < robotArrayList.size(); i++) {

                workingRobot = robotArrayList.get(i);

                MenuAction.printMenuAction(workingRobot);
                menuAction = MenuAction.getStringFromConsole(workingRobot);
                exitFromMenuAction = menuAction.equalsIgnoreCase("l");

                if (workingRobot.getHealthy (workingRobot) <= 0) {
                    isAlive = 0;
                } else if (!keys.toLowerCase().contains(menuAction)) {
                    System.out.println("Entered letter " + menuAction + " is empty in list for shooting");
                } else if (exitFromMenuAction) {
                    return;
                } else {
                    isAlive = workingRobot.shootingToRobot(workingRobot, menuAction);
                }
                if (isAlive == 0) {
                    break;
                }
            }
        }
        System.out.println("The healthy of robot : " + workingRobot.robotName + " is " + workingRobot.healthy + ". GAME OVER :(");
    }
}



