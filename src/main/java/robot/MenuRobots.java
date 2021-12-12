package robot;

public class MenuRobots extends  Menu {
    public static void printMenuRobots() {
        System.out.println("");
        System.out.println("Enter robot's name: ");
    }

    public static Robot setRobotName(String robotsName) {
        Robot tempRobot = ListOfRobots.getRobotHashMap().get("ron");
        return tempRobot;
    }
    }



