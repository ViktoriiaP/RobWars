package robot;

import java.util.HashMap;

public class ListOfRobots {
    private static HashMap <String, Robot> robotHashMap = new HashMap<>();
    
    public static void addRobot (Robot robot){
        robotHashMap.put(robot.getRobotName(),robot);
    }
    public static HashMap <String, Robot> getRobotHashMap(){
        return robotHashMap;
    }
    
}
