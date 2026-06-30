package com.example.ext.app;

import com.example.ext.robot.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Nova");
        System.out.println(robot.getName());
    }
}