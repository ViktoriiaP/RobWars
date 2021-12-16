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

    public void shootingToRobot(Robot workingRobot, String menuAction) {
        if (keysDemageRobot.toLowerCase().contains(menuAction)) {
            keysDemageRobot = keysDemageRobot.toLowerCase().replace((menuAction), "").trim();
            workingRobot.setHealthy(healthy - 20);
            System.out.println("Good shoot! The healthy of robot " + workingRobot.robotName + " after shooting is: " + getHealthy(workingRobot));
        } else if (workingRobot.keysDemageRobot.equals("")) {
            System.out.println("The healthy of robot :" +workingRobot.robotName + " " +workingRobot.getHealthy(workingRobot) + " Game over");
        } else {
            System.out.println("Miss shoot to robot: " + workingRobot.robotName);
        }
    }
}

