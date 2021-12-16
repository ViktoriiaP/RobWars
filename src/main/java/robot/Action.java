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
        boolean emptyHealthy = false;
        do {
            for (int i = 0; i < robotArrayList.size(); i++) {

                workingRobot = robotArrayList.get(i);

                MenuAction.printMenuAction(workingRobot);
                menuAction = MenuAction.getStringFromConsole(workingRobot);
                exitFromMenuAction = menuAction.equalsIgnoreCase("l");
                emptyHealthy = workingRobot.getHealthy(workingRobot)<=0;

                if (!keys.toLowerCase().contains(menuAction)) {
                    System.out.println("Entered letter " + menuAction + " is empty in list for shooting");
                } else if (exitFromMenuAction) {
                    break;
                } else {
                    workingRobot.shootingToRobot(workingRobot, menuAction);
                }
            }
        } while ((exitFromMenuAction!= true) || (emptyHealthy = true));
    }
}



