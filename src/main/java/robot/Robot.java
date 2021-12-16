package robot;

import java.util.Random;

public class Robot {
    private String listOfLetter = "QWEASDZXC";
    public int healthy = 100;
    private String keysDemageRobot = "";
    public String robotName;


    public Robot(String workingRobot) {
        robotName = workingRobot;
        for (int i = 0; i < 5; i++) {
            keysDemageRobot = keysDemageRobot + getRandomKey();
        }
        System.out.println();
    }

    public int getHealthy(Robot workingRobot) {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    char getRandomKey() {
        int randIdx = new Random().nextInt(listOfLetter.length());
        char randChar = listOfLetter.charAt(randIdx);
        listOfLetter = listOfLetter.replace(String.valueOf(randChar), "");
        return randChar;
    }

    public int shootingToRobot(Robot workingRobot, String menuAction) {
        int isAlive = 1;
        if (keysDemageRobot.toLowerCase().contains(menuAction)) {
            keysDemageRobot = keysDemageRobot.toLowerCase().replace((menuAction), "").trim();
            workingRobot.setHealthy(healthy - 20);
            System.out.println("Good shoot! The healthy of robot " + workingRobot.robotName + " after shooting is: " + getHealthy(workingRobot));
        } else {
            System.out.println("Miss shoot to robot: " + workingRobot.robotName);
        }
        if (workingRobot.getHealthy(workingRobot) <= 0) {
            isAlive = 0;
        }
        return isAlive;
    }
}

