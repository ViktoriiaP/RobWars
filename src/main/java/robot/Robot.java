package robot;

import java.util.Random;

public class Robot {
    private String shooting="QWEASDZXC";
    private String keys = "QWEASDZXCL";
    private int healthy=100;
    private String listOfDemageRobot = "";


    public Robot() {
    }

    public int getHealthy(String workingRobot) {
        return healthy-20;
    }

    char getRandomKey(){
        int randIdx = new Random().nextInt(shooting.length());
        char randChar = listOfDemageRobot.charAt(randIdx);
        listOfDemageRobot = listOfDemageRobot.replace(String.valueOf(randChar), "");
        return randChar;
    }

    public Robot (String robotName, String listOfDemageRobot ) { // generate random damageList for robot
        //name from console
        for (int i = 0; i <5 ; i++) {
            listOfDemageRobot=listOfDemageRobot + getRandomKey();
        }
        System.out.println();
    }

    public void shootingToRobot(String robotName, String shootingLetter) {
        if (listOfDemageRobot.trim().toLowerCase().startsWith(shootingLetter)){
            System.out.println("Good shoot!" + getHealthy(robotName));
        }
        else if (shootingLetter.trim().toLowerCase().contains("L")){
            System.out.println("Wrong letter");

        } else {
            System.out.println("Miss shoot");
        }
    }

    public String getRobotName() {
    return "Name";
    }
}
